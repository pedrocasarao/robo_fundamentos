package robo_fundamentos.pucrs.br;

public class Mapa {
	int[][ ] mapa;
	private int largura;
	private int altura;
	
	public Mapa(int largura, int altura)
	{
		 mapa= new int[largura][altura] ;
	}
	
	public void mostraMapa()
	{
		for( int i =0 ; i<mapa.length; i++){
			//System.out.print(1+"\n");
			for(int j=0;j<mapa.length;j++ )
			{
				System.out.printf("%d \t",mapa[i][j]);
			}
		}
	}
	public int getLargura()
	{
		return largura;
	}
	public int getAltura()
	{
		return altura;
	}
}
