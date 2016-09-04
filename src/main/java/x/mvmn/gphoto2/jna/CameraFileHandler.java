package x.mvmn.gphoto2.jna;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.LongByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-file.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraFileHandler extends Structure {
	/**
	 * only for read?<br>
	 * C type : size_callback*
	 */
	public CameraFileHandler.size_callback size;
	/** C type : read_callback* */
	public CameraFileHandler.read_callback read;
	/** C type : write_callback* */
	public CameraFileHandler.write_callback write;
	/** <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-file.h</i> */
	public interface size_callback extends Callback {
		int apply(Pointer priv, LongByReference size);
	};
	/** <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-file.h</i> */
	public interface read_callback extends Callback {
		int apply(Pointer priv, Pointer data, LongByReference len);
	};
	/** <i>native declaration : /usr/local/include/gphoto2/gphoto2/gphoto2-file.h</i> */
	public interface write_callback extends Callback {
		int apply(Pointer priv, Pointer data, LongByReference len);
	};
	public CameraFileHandler() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("size", "read", "write");
	}
	/**
	 * @param size only for read?<br>
	 * C type : size_callback*<br>
	 * @param read C type : read_callback*<br>
	 * @param write C type : write_callback*
	 */
	public CameraFileHandler(CameraFileHandler.size_callback size, CameraFileHandler.read_callback read, CameraFileHandler.write_callback write) {
		super();
		this.size = size;
		this.read = read;
		this.write = write;
	}
	public CameraFileHandler(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraFileHandler implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraFileHandler implements Structure.ByValue {
		
	};
}