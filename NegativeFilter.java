package filter_Processor;

public class NegativeFilter implements Filter{

	@Override
	public void filter(PixelImage theImage) {
		// TODO Auto-generated method stub
		Pixel[][] data = theImage.getData();
		for (int row = 0;row < data.length;row++) {
			for (int col = 0;col< data[row].length;col++) {
				
				data[row][col].red = 255 - data[row][col].red ;
				data[row][col].blue = 255 - data[row][col].blue ;
				data[row][col].green = 255 - data[row][col].green;
			}
		}
		theImage.setData(data);
	}

}
