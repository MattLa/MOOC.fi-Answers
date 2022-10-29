package application;

import application.domain.Party;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import logic.Database;
import logic.ReadFile;


public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Database data = new Database();
        ReadFile reader = new ReadFile(data);
        reader.read();
        
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        // create the data sets that are going to be added to the line chart
        List<XYChart.Series> chartInfo = new ArrayList<>();
        List<Party> partyList = data.getList();
        
        //Add the info to the datasets
        for (int i = 0; i < partyList.size(); i++) {
            chartInfo.add(new XYChart.Series());
            chartInfo.get(i).setName(partyList.get(i).getName());
            HashMap<Integer, Double> list = partyList.get(i).getSupport();
            
            for (int j : list.keySet()) {
                chartInfo.get(i).getData().add(new XYChart.Data(j, list.get(j)));
            }
        }
        
        //Add the info to the chart
        for (int i = 0; i < chartInfo.size(); i++) {
            lineChart.getData().add(chartInfo.get(i));
        }
        
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
}
