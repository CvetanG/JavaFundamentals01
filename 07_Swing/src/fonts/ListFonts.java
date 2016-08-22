package fonts;

import java.awt.GraphicsEnvironment;

public class ListFonts {
	public static void main(String[] args) {
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String fontName : fontNames)
			System.out.println(fontName);
		System.out.println("Total Fonts in your system: " + fontNames.length);
	}
}
