
public class MagicSquareFactory {

    /*
    The Siamese method algorithm works in the following manner. You set number 
    one to the centermost column of the top row. After this, we move one row up 
    and one column right, and place number two in this cell. We continue by 
    moving one right, one up, and placing the number 3, etc.
    
    Two rules govern the number placements:

    If the transition would leave us outside the bounds of the magic square, we 
    jump to the opposite edge. In other words, if we go "over the right edge" we 
    continue from the left edge, and if we go "over the top edge" we continue 
    from the bottom.

    If the place already contains a number, we don't go up and right. Instead we 
    take one step downwards.

    */
    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        //starting position for the magic square
		int currentRow = 0;

		int currentCol = size / 2;

		square.placeValue(currentCol, currentRow, 1);

		for (int i = 2; i <= size*size  ; i++) {

			int nextRow = currentRow - 1;

			if (nextRow < 0) {
				nextRow = square.getHeight() - 1;
			}

			int nextCol = currentCol + 1;
			if (nextCol >= square.getWidth()) {
				nextCol = 0;
			}

			int nextBoxValue = square.readValue(nextCol, nextRow);

			if (nextBoxValue != 0) {
				nextRow = currentRow + 1;
				nextCol = currentCol;
			}

			square.placeValue(nextCol, nextRow, i);
			currentRow = nextRow;
			currentCol = nextCol;
		}
        

        // implement the creation of a magic square with the Siamese method 
        //algorithm here
        return square;
    }

}
