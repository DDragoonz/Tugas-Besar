package versi2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Kontrol {
	
	private JFileChooser fc = new JFileChooser();
	private RuangKelas kelas;
	File file;
	
	public void save(RuangKelas kelas){
		
		
		int returnVal = fc.showSaveDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            try {
   	         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
   	         os.writeObject(kelas);
   	         os.close();
   	         JOptionPane.showMessageDialog(null, "Kelas berhasil disimpan");
   	      } catch(Exception ex) {

   	      }
        }
	}
	
	public RuangKelas load(){
		int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            try {

    			ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
    			kelas = (RuangKelas)is.readObject();
    			is.close();
    		} catch (Exception ex) {
    			JOptionPane.showMessageDialog(null, "Data not Found !");
    		}
        }
        return kelas;
	}
	
	public void hapusKelas(){
		file.delete();
		JOptionPane.showMessageDialog(null, "Sukses Hapus");
	}
	
}
