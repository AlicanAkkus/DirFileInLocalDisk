package FileSinifi;

import java.io.File;

public class DirFileInLocakDisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirName = "C://";
		File f1 = new File(dirName);

		if (f1.isDirectory()) {
			System.out.println("Directory of  : " + dirName);
			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(dirName + "/" + s[i]);

				if (f.isDirectory()) {
					System.out.println(s[i] + " is a Directory ..");
				} else {
					System.out.println(s[i] + " is a File ..	");
				}
			}
		} else {
			System.out.println(dirName + " is not a directory ..");
		}

	}

}
