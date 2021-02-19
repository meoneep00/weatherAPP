#weatherAPP
Exception in Application start method
java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.sun.javafx.application.LauncherImpl.launchApplicationWithArgs(LauncherImpl.java:389)
	at com.sun.javafx.application.LauncherImpl.launchApplication(LauncherImpl.java:328)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.launcher.LauncherHelper$FXHelper.main(LauncherHelper.java:767)
Caused by: java.lang.RuntimeException: Exception in Application start method
	at com.sun.javafx.application.LauncherImpl.launchApplication1(LauncherImpl.java:917)
	at com.sun.javafx.application.LauncherImpl.lambda$launchApplication$154(LauncherImpl.java:182)
	at java.lang.Thread.run(Thread.java:748)
Caused by: javafx.fxml.LoadException: 
/E:/weatherAPP/out/production/weatherAPP/sample/sample.fxml

	at javafx.fxml.FXMLLoader.constructLoadException(FXMLLoader.java:2601)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:2571)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:2441)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3214)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3175)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3148)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3124)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:3104)
	at javafx.fxml.FXMLLoader.load(FXMLLoader.java:3097)
	at sample.Main.start(Main.java:13)
	at com.sun.javafx.application.LauncherImpl.lambda$launchApplication1$161(LauncherImpl.java:863)
	at com.sun.javafx.application.PlatformImpl.lambda$runAndWait$174(PlatformImpl.java:326)
	at com.sun.javafx.application.PlatformImpl.lambda$null$172(PlatformImpl.java:295)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.sun.javafx.application.PlatformImpl.lambda$runLater$173(PlatformImpl.java:294)
	at com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:95)
	at com.sun.glass.ui.win.WinApplication._runLoop(Native Method)
	at com.sun.glass.ui.win.WinApplication.lambda$null$147(WinApplication.java:177)
	... 1 more
Caused by: java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.reflect.misc.Trampoline.invoke(MethodUtil.java:71)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.reflect.misc.MethodUtil.invoke(MethodUtil.java:275)
	at javafx.fxml.FXMLLoader.loadImpl(FXMLLoader.java:2566)
	... 17 more
Caused by: java.lang.NullPointerException
	at sample.Controller.initialize(Controller.java:51)
	... 28 more
Exception running application sample.Main

Process finished with exit code 1
