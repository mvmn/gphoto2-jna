package x.mvmn.gphoto2.jna;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : gphoto2/gphoto2-abilities-list.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraAbilities extends Structure {
	/**
	 * < \brief name of camera model<br>
	 * C type : char[128]
	 */
	public byte[] model = new byte[128];
	/**
	 * @see CameraDriverStatus<br>
	 * < \brief driver quality<br>
	 * C type : CameraDriverStatus
	 */
	public int status;
	/**
	 * @see GPPortType<br>
	 * C type : GPPortType
	 */
	public int port;
	/** C type : int[64] */
	public int[] speed = new int[64];
	/**
	 * @see CameraOperation<br>
	 * < \brief Camera operation funcs<br>
	 * C type : CameraOperation
	 */
	public int operations;
	/**
	 * @see CameraFileOperation<br>
	 * < \brief Camera file op funcs<br>
	 * C type : CameraFileOperation
	 */
	public int file_operations;
	/**
	 * @see CameraFolderOperation<br>
	 * < \brief Camera folder op funcs<br>
	 * C type : CameraFolderOperation
	 */
	public int folder_operations;
	/** < \brief USB Vendor D */
	public int usb_vendor;
	/** < \brief USB Product ID */
	public int usb_product;
	/** < \brief USB device class */
	public int usb_class;
	/** < \brief USB device subclass */
	public int usb_subclass;
	/** < \brief USB device protocol */
	public int usb_protocol;
	/**
	 * < \brief (Internal) library filename<br>
	 * C type : char[1024]
	 */
	public byte[] library = new byte[1024];
	/**
	 * < \brief (Internal) camera ID name<br>
	 * C type : char[1024]
	 */
	public byte[] id = new byte[1024];
	/**
	 * @see GphotoDeviceType<br>
	 * < \brief Device type.<br>
	 * C type : GphotoDeviceType
	 */
	public int device_type;
	/** < reserved space \internal */
	public int reserved2;
	/** < reserved space \internal */
	public int reserved3;
	/** < reserved space \internal */
	public int reserved4;
	/** < reserved space \internal */
	public int reserved5;
	/** < reserved space \internal */
	public int reserved6;
	/** < reserved space \internal */
	public int reserved7;
	/** < reserved space \internal */
	public int reserved8;
	public CameraAbilities() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("model", "status", "port", "speed", "operations", "file_operations", "folder_operations", "usb_vendor", "usb_product", "usb_class", "usb_subclass", "usb_protocol", "library", "id", "device_type", "reserved2", "reserved3", "reserved4", "reserved5", "reserved6", "reserved7", "reserved8");
	}
	public CameraAbilities(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraAbilities implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraAbilities implements Structure.ByValue {
		
	};
}
