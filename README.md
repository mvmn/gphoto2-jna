# gphoto2-jna
JNA bridge to GPhoto2 native library

## Overview
The code in package `x.mvmn.gphoto2.jna` was generated using [JNAerator](https://en.wikipedia.org/wiki/JNAerator):
```
java -jar jnaerator-0.12-shaded.jar -library gphoto2 /usr/local/lib/libgphoto2.dylib /usr/local/include/gphoto2/gphoto2/gphoto2.h -I/usr/local/include/gphoto2/ -mode Maven -noLibBundle -package x.mvmn.gphoto2.jna -f -runtime JNA
```
Certain modifications were made to generated code to avoid dependencies on JNAerator types - some of the internal GPhoto2 methods that were picked up by JNAerator had to be commented out (namely the gp_file_slurp methods).

The `x.mvmn.gphoto2.jna.tmp.TestSwingLiveView` is a demo of LiveView captured from camera and viewed in Swing based GUI window.
