package filter_Processor;

public class LaplacianFilter implements Filter {

	@Override
	public void filter(PixelImage theImage) {
		// TODO Auto-generated method stub
		Pixel[][] data = theImage.getData();
		int[][] weight = {{-1,-1,-1},{-1,8,-1},{-1,-1,-1}};
		data = theImage.calculate(weight, data, false);
		
		theImage.setData(data);
		
	}
	
}
