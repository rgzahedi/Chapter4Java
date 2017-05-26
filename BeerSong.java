package org.chapter4.absolutejava;

public class BeerSong {

	private String stringOfBeers;
	private int numBeers;
	private String overallString;

	public BeerSong() {
		/* Do nothing */
	}

	public BeerSong(int numberOfBeers) {
		run(numberOfBeers);
	}

	private void run(int bottleBeer) {
		numBeers = bottleBeer;
		while (numBeers > 0) {
			setSong(numBeers);
			this.overallString = toString();
			System.out.println(this.overallString);
			numBeers--;
		}
	}

	private void setSong(int bottleBeer) {
		this.numBeers = bottleBeer;
		if (numBeers > 99) {
			this.numBeers = 99;
			this.stringOfBeers = "Ninety-nine";
		} else if (numBeers < 0) {
			this.numBeers = 0;
			this.stringOfBeers = "Zero";
		} else if ((numBeers <= 99) && (numBeers >= 0))
			this.stringOfBeers = bottleString(numBeers);
	}

	public String getStringOfBeers() {
		return stringOfBeers;
	}

	public void setStringOfBeers(String stringOfBeers) {
		this.stringOfBeers = stringOfBeers;
	}

	@Override
	public String toString() {
		if (numBeers == 1)
			return (this.stringOfBeers + " bottle of beer on the wall,\n" + this.stringOfBeers
					+ " bottle of beer,\nTake one down, pass it around,\n" + bottleString(numBeers - 1)
					+ " bottles of beer on the wall.");
		else if (numBeers == 2)
			return (this.stringOfBeers + " bottles of beer on the wall,\n" + this.stringOfBeers
					+ " bottles of beer,\nTake one down, pass it around,\n" + bottleString(numBeers - 1)
					+ " bottle of beer on the wall.");
		else
			return (this.stringOfBeers + " bottles of beer on the wall,\n" + this.stringOfBeers
					+ " bottles of beer,\nTake one down, pass it around,\n" + bottleString(numBeers - 1)
					+ " bottles of beer on the wall.");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BeerSong beer = new BeerSong(99);
	}

	private String bottleString(int bottleNumber) {
		switch (bottleNumber) {
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		case 10:
			return "Ten";
		case 11:
			return "Eleven";
		case 12:
			return "Twelve";
		case 13:
			return "Thirteen";
		case 14:
			return "Fourteen";
		case 15:
			return "Fifteen";
		case 16:
			return "Sixteen";
		case 17:
			return "Seventeen";
		case 18:
			return "Eighteen";
		case 19:
			return "Nineteen";
		case 20:
			return "Twenty";
		case 21:
			return "Twenty-one";
		case 22:
			return "Twenty-two";
		case 23:
			return "Twenty-three";
		case 24:
			return "Twenty-four";
		case 25:
			return "Twenty-five";
		case 26:
			return "Twenty-six";
		case 27:
			return "Twenty-seven";
		case 28:
			return "Twenty-eight";
		case 29:
			return "Twenty-nine";
		case 30:
			return "Thirty";
		case 31:
			return "Thirty-one";
		case 32:
			return "Thirty-two";
		case 33:
			return "Thirty-three";
		case 34:
			return "Thirty-four";
		case 35:
			return "Thirty-five";
		case 36:
			return "Thirty-six";
		case 37:
			return "Thirty-seven";
		case 38:
			return "Thirty-eight";
		case 39:
			return "Thirty-nine";
		case 40:
			return "Forty";
		case 41:
			return "Forty-one";
		case 42:
			return "Forty-two";
		case 43:
			return "Forty-three";
		case 44:
			return "Forty-four";
		case 45:
			return "Forty-five";
		case 46:
			return "Forty-six";
		case 47:
			return "Forty-seven";
		case 48:
			return "Forty-eight";
		case 49:
			return "Forty-nine";
		case 50:
			return "Fifty";
		case 51:
			return "Fifty-one";
		case 52:
			return "Fifty-two";
		case 53:
			return "Fifty-three";
		case 54:
			return "Fifty-four";
		case 55:
			return "Fifty-five";
		case 56:
			return "Fifty-six";
		case 57:
			return "Fifty-seven";
		case 58:
			return "Fifty-eight";
		case 59:
			return "Fifty-nine";
		case 60:
			return "Sixty";
		case 61:
			return "Sixty-one";
		case 62:
			return "Sixty-two";
		case 63:
			return "Sixty-three";
		case 64:
			return "Sixty-four";
		case 65:
			return "Sixty-five";
		case 66:
			return "Sixty-six";
		case 67:
			return "Sixty-seven";
		case 68:
			return "Sixty-eight";
		case 69:
			return "Sixty-nine";
		case 70:
			return "Seventy";
		case 71:
			return "Seventy-one";
		case 72:
			return "Seventy-two";
		case 73:
			return "Seventy-three";
		case 74:
			return "Seventy-four";
		case 75:
			return "Seventy-five";
		case 76:
			return "Seventy-six";
		case 77:
			return "Seventy-seven";
		case 78:
			return "Seventy-eight";
		case 79:
			return "Seventy-nine";
		case 80:
			return "Eighty";
		case 81:
			return "Eighty-one";
		case 82:
			return "Eighty-two";
		case 83:
			return "Eighty-three";
		case 84:
			return "Eighty-four";
		case 85:
			return "Eighty-five";
		case 86:
			return "Eighty-six";
		case 87:
			return "Eighty-seven";
		case 88:
			return "Eighty-eight";
		case 89:
			return "Eighty-nine";
		case 90:
			return "Ninety";
		case 91:
			return "Ninety-one";
		case 92:
			return "Ninety-two";
		case 93:
			return "Ninety-three";
		case 94:
			return "Ninety-four";
		case 95:
			return "Ninety-five";
		case 96:
			return "Ninety-six";
		case 97:
			return "Ninety-seven";
		case 98:
			return "Ninety-eight";
		case 99:
			return "Ninety-nine";
		default:
			return "Zero";
		}
	}
}
