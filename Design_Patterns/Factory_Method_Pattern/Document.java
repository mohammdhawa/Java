public interface Document {
	
	public void open();
	public void close();
	public Document getDocumentType();

}


class Pdf implements Document {
	
	public void open() {
		System.out.println("pdf has opened");
	}
	public void close() {
		System.out.println("pdf has closed");
	}
	
	public Document getDocumentType() {
		return new Pdf();
	}
	
}

class Word implements Document {
	
	public void open() {
		System.out.println("Word has opened");
	}
	public void close() {
		System.out.println("Word has closed");
	}
	
	public Document getDocumentType() {
		return new Word();
	}
	
}

////////////////////////////////////////////////////////////////

public class DocumentFactory {
	
	public static Document createDocument(String type) {
		if(type=="pdf") {
			return new Pdf();
		}
		else if(type=="word") {
			return new Word();
		}
		return null;
	}

}

public class DocumentService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document pd = DocumentFactory.createDocument("pdf");
		
		pd.open();
		
		Document wd = DocumentFactory.createDocument("word");
		
		wd.open();
		
		pd.close();
		wd.close();

	}

}
