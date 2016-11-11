class ArrayTranspose
{
	public static void main(String args[])

	{
		int arrayName[][]=new int[2][3];
		int riterator=0;
		int citerator=0;
		int index=0;

				for(riterator=0;riterator<arrayName.length;riterator++)
				{
				for(citerator=0;citerator<arrayName[riterator].length;citerator++)
				{
					arrayName[riterator][citerator]=Integer.parseInt(args[index]);
					index++;
				}  v                                                                                                   
			}
	    for(riterator=0;riterator<arrayName[0].length;riterator++)
			{
		        for(citerator=0;citerator<arrayName.length;citerator++)
				{
					System.out.print(arrayName[citerator][riterator]+"\t");
				}
				System.out.println("\n");
			}		
	}
}
