class Main 
{
  public static void main(String[] args) 
  {
    String [][] coord = new String[3][5];
    //populate the array
    for(int i = 0; i < coord.length; i++)
    {
      for(int j = 0; j < coord[i].length; j++)
      {
        coord[i][j] = "(" + i + "," + j + ")";
      }//end inner for loop for columns
    }//end outer for loop for rows

    //print out the array
    System.out.println("---Ouput the coordinates---");
    for(int i = 0; i < coord.length; i++)
    {
      for(int j = 0; j < coord[i].length; j++)
      {
        System.out.print(coord[i][j] + "\t");
      }
      System.out.println();
    }

  }//end main
}//end class