# gphoto2-jna
JNA bridge to GPhoto2 native library

## Overview
The code in package x.mvmn.gphoto2.jna was generated using JNAerator:
```
java -jar jnaerator-0.12-shaded.jar -library gphoto2 /usr/local/lib/libgphoto2.dylib /usr/local/include/gphoto2/gphoto2/gphoto2.h -I/usr/local/include/gphoto2/ -mode Maven -noLibBundle -package x.mvmn.gphoto2.jna -f -runtime JNA
```

The x.mvmn.gphoto2.jna.tmp.TestSwingLiveView is a demo of LiveView captured from camera and viewed in Swing based GUI window.
