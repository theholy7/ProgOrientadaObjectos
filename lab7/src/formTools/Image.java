package formTools;

import java.util.ArrayList;

public class Image{
	
	int imgxSize;
	int imgySize;
	
	ArrayList<Form> imgArray = new ArrayList<Form>();
	

	public Image(int imgxSize, int imgySize) {
		super();
		this.imgxSize = imgxSize;
		this.imgySize = imgySize;
	}

	public void imgAdd(Form newForm){
		imgArray.add(newForm);
	}
	
	public String imgLine(int yLine){
		char[] imgLine = new char[this.imgxSize];
		for(int i = 0; i<this.imgxSize; i++)
			imgLine[i] = ' ';
		
		for(Form imgForm:imgArray){
			for(int i:imgForm.intersection(yLine))
				imgLine[i] = '*';
		}
		
		return new String(imgLine);
	}

	@Override
	public String toString() {
		String img = new String();
		for(int i = 0; i<this.imgySize; i++){
			img += this.imgLine(i) + '\n';
		}
		
		return img;
	}
	
	public static void main(String[] args) {
		Image a = new Image(10,10);
		Rectangle r = new Rectangle(2,2,5,5);
		a.imgAdd(r);
		System.out.println(a);
	}
}
