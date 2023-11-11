package x.mvmn.gphoto2.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : gphoto2/gphoto2-filesys.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraStorageInformation extends Structure {
	/**
	 * @see CameraStorageInfoFields<br>
	 * < \brief Bitmask of struct members that are specified.<br>
	 * C type : CameraStorageInfoFields
	 */
	public int fields;
	/**
	 * < \brief Basedirectory of the storage. Will be "/" if just 1 storage on the camera.<br>
	 * C type : char[256]
	 */
	public byte[] basedir = new byte[256];
	/**
	 * < \brief Label of the storage. Similar to DOS label.<br>
	 * C type : char[256]
	 */
	public byte[] label = new byte[256];
	/**
	 * < \brief Description of the storage.<br>
	 * C type : char[256]
	 */
	public byte[] description = new byte[256];
	/**
	 * @see CameraStorageType<br>
	 * < \brief Hardware type of the storage.<br>
	 * C type : CameraStorageType
	 */
	public int type;
	/**
	 * @see CameraStorageFilesystemType<br>
	 * < \brief Hierarchy type of the filesystem.<br>
	 * C type : CameraStorageFilesystemType
	 */
	public int fstype;
	/**
	 * @see CameraStorageAccessType<br>
	 * < \brief Access permissions.<br>
	 * C type : CameraStorageAccessType
	 */
	public int access;
	/** < \brief Total capacity in kbytes. */
	public long capacitykbytes;
	/** < \brief Free space in kbytes. */
	public long freekbytes;
	/** < \brief Free space in images (guessed by camera). */
	public long freeimages;
	public CameraStorageInformation() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("fields", "basedir", "label", "description", "type", "fstype", "access", "capacitykbytes", "freekbytes", "freeimages");
	}
	public CameraStorageInformation(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraStorageInformation implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraStorageInformation implements Structure.ByValue {
		
	};
}
