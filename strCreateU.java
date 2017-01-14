	public  class strCreate  {
		public  String make1 (int chn, int f ){
			String message1 = "";
			//int f = 156025;
			StringBuilder sb1 = new StringBuilder(message1);
			sb1.append("M ch ");
			sb1.append(chn);
			sb1.append(" F = ");
			sb1.append(f/1000);
			sb1.append(".");
			sb1.append(f%1000);
			sb1.append("MHz\n");
			//return message1; // return sb1;   work done to create sb1  
			return sb1.toString();
		}
	}
