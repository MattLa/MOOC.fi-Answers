/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Timer {
    
    private ClockHand seconds;
    private ClockHand milliseconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliseconds = new ClockHand(100);
    }
    
    public void advance() {
        milliseconds.advance();
        if (milliseconds.value() == 0) {
            seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return seconds + ":" + milliseconds;
    }
}
