package org.gtk.gio;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static boolean signalDBusServerNewConnection(MemoryAddress source, MemoryAddress connection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusServer.NewConnectionHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DBusServer(References.get(source)), new DBusConnection(References.get(connection, false)));
    }
    
    public static boolean signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress source, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectSkeleton.AuthorizeMethodHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DBusObjectSkeleton(References.get(source)), new DBusInterfaceSkeleton(References.get(interface_, false)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
    public static void cbBusNameVanishedCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BusNameVanishedCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameVanishedCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static void signalUnixMountMonitorMountpointsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (UnixMountMonitor.MountpointsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new UnixMountMonitor(References.get(source)));
    }
    
    public static void signalUnixMountMonitorMountsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (UnixMountMonitor.MountsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new UnixMountMonitor(References.get(source)));
    }
    
    public static void cbBusNameAppearedCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress nameOwner, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BusNameAppearedCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameAppearedCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0), nameOwner.getUtf8String(0));
    }
    
    public static void signalMemoryMonitorLowMemoryWarning(MemoryAddress source, int level, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MemoryMonitor.LowMemoryWarningHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MemoryMonitor.MemoryMonitorImpl(References.get(source)), MemoryMonitorWarningLevel.fromValue(level));
    }
    
    public static void signalListModelItemsChanged(MemoryAddress source, int position, int removed, int added, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListModel.ItemsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ListModel.ListModelImpl(References.get(source)), position, removed, added);
    }
    
    public static void signalDBusProxyGPropertiesChanged(MemoryAddress source, MemoryAddress changedProperties, MemoryAddress invalidatedProperties, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusProxy.GPropertiesChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusProxy(References.get(source)), new org.gtk.glib.Variant(References.get(changedProperties, false)), null);
    }
    
    public static void signalDBusProxyGSignal(MemoryAddress source, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusProxy.GSignalHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusProxy(References.get(source)), senderName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)));
    }
    
    public static void cbFileMeasureProgressCallback(boolean reporting, long currentSize, long numDirs, long numFiles, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FileMeasureProgressCallback) Interop.signalRegistry.get(hash);
        handler.onFileMeasureProgressCallback(reporting, currentSize, numDirs, numFiles);
    }
    
    public static boolean signalDBusAuthObserverAllowMechanism(MemoryAddress source, MemoryAddress mechanism, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusAuthObserver.AllowMechanismHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DBusAuthObserver(References.get(source)), mechanism.getUtf8String(0));
    }
    
    public static boolean signalDBusAuthObserverAuthorizeAuthenticatedPeer(MemoryAddress source, MemoryAddress stream, MemoryAddress credentials, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusAuthObserver.AuthorizeAuthenticatedPeerHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DBusAuthObserver(References.get(source)), new IOStream(References.get(stream, false)), new Credentials(References.get(credentials, false)));
    }
    
    public static boolean cbDatagramBasedSourceFunc(MemoryAddress datagramBased, int condition, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DatagramBasedSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onDatagramBasedSourceFunc(new DatagramBased.DatagramBasedImpl(References.get(datagramBased, false)), condition);
    }
    
    public static boolean cbSettingsGetMapping(MemoryAddress value, MemoryAddress result, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SettingsGetMapping) Interop.signalRegistry.get(hash);
        return handler.onSettingsGetMapping(new org.gtk.glib.Variant(References.get(value, false)), result);
    }
    
    public static boolean signalDtlsConnectionAcceptCertificate(MemoryAddress source, MemoryAddress peerCert, int errors, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DtlsConnection.AcceptCertificateHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DtlsConnection.DtlsConnectionImpl(References.get(source)), new TlsCertificate(References.get(peerCert, false)), errors);
    }
    
    public static boolean signalSettingsChangeEvent(MemoryAddress source, MemoryAddress keys, int nKeys, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.ChangeEventHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Settings(References.get(source)), null, nKeys);
    }
    
    public static void signalSettingsChanged(MemoryAddress source, MemoryAddress key, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Settings(References.get(source)), key.getUtf8String(0));
    }
    
    public static boolean signalSettingsWritableChangeEvent(MemoryAddress source, int key, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.WritableChangeEventHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Settings(References.get(source)), key);
    }
    
    public static void signalSettingsWritableChanged(MemoryAddress source, MemoryAddress key, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.WritableChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Settings(References.get(source)), key.getUtf8String(0));
    }
    
    public static void signalVolumeMonitorDriveChanged(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveConnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveConnectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveDisconnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveDisconnectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveEjectButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveEjectButtonHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveStopButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveStopButtonHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorMountAdded(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorMountChanged(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorMountPreUnmount(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountPreUnmountHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorMountRemoved(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorVolumeAdded(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.VolumeAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Volume.VolumeImpl(References.get(volume, false)));
    }
    
    public static void signalVolumeMonitorVolumeChanged(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.VolumeChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Volume.VolumeImpl(References.get(volume, false)));
    }
    
    public static void signalVolumeMonitorVolumeRemoved(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.VolumeRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Volume.VolumeImpl(References.get(volume, false)));
    }
    
    public static void signalApplicationActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationCommandLine(MemoryAddress source, MemoryAddress commandLine, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.CommandLineHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), new ApplicationCommandLine(References.get(commandLine, false)));
    }
    
    public static void signalApplicationHandleLocalOptions(MemoryAddress source, MemoryAddress options, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.HandleLocalOptionsHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), new org.gtk.glib.VariantDict(References.get(options, false)));
    }
    
    public static boolean signalApplicationNameLost(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.NameLostHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationOpen(MemoryAddress source, MemoryAddress files, int nFiles, MemoryAddress hint, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.OpenHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), null, nFiles, hint.getUtf8String(0));
    }
    
    public static void signalApplicationShutdown(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.ShutdownHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationStartup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.StartupHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static org.gtk.glib.Variant cbDBusInterfaceGetPropertyFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress error, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusInterfaceGetPropertyFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusInterfaceGetPropertyFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), propertyName.getUtf8String(0), new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static void cbBusAcquiredCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BusAcquiredCallback) Interop.signalRegistry.get(hash);
        handler.onBusAcquiredCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static void signalMountOperationAborted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.AbortedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)));
    }
    
    public static void signalMountOperationAskPassword(MemoryAddress source, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.AskPasswordHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), defaultUser.getUtf8String(0), defaultDomain.getUtf8String(0), flags);
    }
    
    public static void signalMountOperationAskQuestion(MemoryAddress source, MemoryAddress message, MemoryAddress choices, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.AskQuestionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), null);
    }
    
    public static void signalMountOperationReply(MemoryAddress source, int result, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.ReplyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), MountOperationResult.fromValue(result));
    }
    
    public static void signalMountOperationShowProcesses(MemoryAddress source, MemoryAddress message, MemoryAddress processes, MemoryAddress choices, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.ShowProcessesHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), null, null);
    }
    
    public static void signalMountOperationShowUnmountProgress(MemoryAddress source, MemoryAddress message, long timeLeft, long bytesLeft, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.ShowUnmountProgressHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), timeLeft, bytesLeft);
    }
    
    public static org.gtk.glib.Variant cbSettingsBindSetMapping(MemoryAddress value, MemoryAddress expectedType, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SettingsBindSetMapping) Interop.signalRegistry.get(hash);
        return handler.onSettingsBindSetMapping(new org.gtk.gobject.Value(References.get(value, false)), new org.gtk.glib.VariantType(References.get(expectedType, false)));
    }
    
    public static void signalActionGroupActionAdded(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0));
    }
    
    public static void signalActionGroupActionEnabledChanged(MemoryAddress source, MemoryAddress actionName, boolean enabled, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionEnabledChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0), enabled);
    }
    
    public static void signalActionGroupActionRemoved(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0));
    }
    
    public static void signalActionGroupActionStateChanged(MemoryAddress source, MemoryAddress actionName, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionStateChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0), new org.gtk.glib.Variant(References.get(value, false)));
    }
    
    public static jdk.incubator.foreign.MemoryAddress cbReallocFunc(MemoryAddress data, long size) {
        int hash = data.get(C_INT, 0);
        var handler = (ReallocFunc) Interop.signalRegistry.get(hash);
        return handler.onReallocFunc(size);
    }
    
    public static boolean cbCancellableSourceFunc(MemoryAddress cancellable, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (CancellableSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onCancellableSourceFunc(new Cancellable(References.get(cancellable, false)));
    }
    
    public static boolean cbDBusInterfaceSetPropertyFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress propertyName, MemoryAddress value, MemoryAddress error, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusInterfaceSetPropertyFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusInterfaceSetPropertyFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), propertyName.getUtf8String(0), new org.gtk.glib.Variant(References.get(value, false)), new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static void cbBusNameLostCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BusNameLostCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameLostCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static void signalVolumeChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Volume.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Volume.VolumeImpl(References.get(source)));
    }
    
    public static void signalVolumeRemoved(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Volume.RemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Volume.VolumeImpl(References.get(source)));
    }
    
    public static boolean cbFileReadMoreCallback(MemoryAddress fileContents, long fileSize, MemoryAddress callbackData) {
        int hash = callbackData.get(C_INT, 0);
        var handler = (FileReadMoreCallback) Interop.signalRegistry.get(hash);
        return handler.onFileReadMoreCallback(fileContents.getUtf8String(0), fileSize);
    }
    
    public static boolean cbSocketSourceFunc(MemoryAddress socket, int condition, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SocketSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onSocketSourceFunc(new Socket(References.get(socket, false)), condition);
    }
    
    public static void cbDesktopAppLaunchCallback(MemoryAddress appinfo, MemoryAddress pid, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DesktopAppLaunchCallback) Interop.signalRegistry.get(hash);
        handler.onDesktopAppLaunchCallback(new DesktopAppInfo(References.get(appinfo, false)), org.gtk.glib.Pid.fromValue(pid));
    }
    
    public static void signalFileMonitorChanged(MemoryAddress source, MemoryAddress file, MemoryAddress otherFile, int eventType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileMonitor.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FileMonitor(References.get(source)), new File.FileImpl(References.get(file, false)), new File.FileImpl(References.get(otherFile, false)), FileMonitorEvent.fromValue(eventType));
    }
    
    public static boolean cbPollableSourceFunc(MemoryAddress pollableStream, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (PollableSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onPollableSourceFunc(new org.gtk.gobject.Object(References.get(pollableStream, false)));
    }
    
    public static void signalSocketClientEvent(MemoryAddress source, int event, MemoryAddress connectable, MemoryAddress connection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SocketClient.EventHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SocketClient(References.get(source)), SocketClientEvent.fromValue(event), new SocketConnectable.SocketConnectableImpl(References.get(connectable, false)), new IOStream(References.get(connection, false)));
    }
    
    public static void signalSocketListenerEvent(MemoryAddress source, int event, MemoryAddress socket, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SocketListener.EventHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SocketListener(References.get(source)), SocketListenerEvent.fromValue(event), new Socket(References.get(socket, false)));
    }
    
    public static void signalDriveChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalDriveDisconnected(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.DisconnectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalDriveEjectButton(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.EjectButtonHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalDriveStopButton(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.StopButtonHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void cbAsyncReadyCallback(MemoryAddress sourceObject, MemoryAddress res, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (AsyncReadyCallback) Interop.signalRegistry.get(hash);
        handler.onAsyncReadyCallback(new org.gtk.gobject.Object(References.get(sourceObject, false)), new AsyncResult.AsyncResultImpl(References.get(res, false)));
    }
    
    public static boolean cbSettingsBindGetMapping(MemoryAddress value, MemoryAddress variant, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SettingsBindGetMapping) Interop.signalRegistry.get(hash);
        return handler.onSettingsBindGetMapping(new org.gtk.gobject.Value(References.get(value, false)), new org.gtk.glib.Variant(References.get(variant, false)));
    }
    
    public static void signalSimpleActionActivate(MemoryAddress source, MemoryAddress parameter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SimpleAction.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SimpleAction(References.get(source)), new org.gtk.glib.Variant(References.get(parameter, false)));
    }
    
    public static void signalSimpleActionChangeState(MemoryAddress source, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SimpleAction.ChangeStateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SimpleAction(References.get(source)), new org.gtk.glib.Variant(References.get(value, false)));
    }
    
    public static DBusInterfaceVTable cbDBusSubtreeDispatchFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress node, MemoryAddress outUserData, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusSubtreeDispatchFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusSubtreeDispatchFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), node.getUtf8String(0), outUserData);
    }
    
    public static void cbDBusSignalCallback(MemoryAddress connection, MemoryAddress senderName, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusSignalCallback) Interop.signalRegistry.get(hash);
        handler.onDBusSignalCallback(new DBusConnection(References.get(connection, false)), senderName.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)));
    }
    
    public static void cbFileProgressCallback(long currentNumBytes, long totalNumBytes, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (FileProgressCallback) Interop.signalRegistry.get(hash);
        handler.onFileProgressCallback(currentNumBytes, totalNumBytes);
    }
    
    public static void signalFilenameCompleterGotCompletionData(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FilenameCompleter.GotCompletionDataHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new FilenameCompleter(References.get(source)));
    }
    
    public static File cbVfsFileLookupFunc(MemoryAddress vfs, MemoryAddress identifier, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (VfsFileLookupFunc) Interop.signalRegistry.get(hash);
        return handler.onVfsFileLookupFunc(new Vfs(References.get(vfs, false)), identifier.getUtf8String(0));
    }
    
    public static boolean signalThreadedSocketServiceRun(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ThreadedSocketService.RunHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new ThreadedSocketService(References.get(source)), new SocketConnection(References.get(connection, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)));
    }
    
    public static void cbDBusInterfaceMethodCallFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress methodName, MemoryAddress parameters, MemoryAddress invocation, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusInterfaceMethodCallFunc) Interop.signalRegistry.get(hash);
        handler.onDBusInterfaceMethodCallFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), interfaceName.getUtf8String(0), methodName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)), new DBusMethodInvocation(References.get(invocation, true)));
    }
    
    public static void signalCancellableCancelled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Cancellable.CancelledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Cancellable(References.get(source)));
    }
    
    public static void signalNetworkMonitorNetworkChanged(MemoryAddress source, boolean networkAvailable, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NetworkMonitor.NetworkChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new NetworkMonitor.NetworkMonitorImpl(References.get(source)), networkAvailable);
    }
    
    public static void cbDBusSubtreeEnumerateFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusSubtreeEnumerateFunc) Interop.signalRegistry.get(hash);
        handler.onDBusSubtreeEnumerateFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0));
    }
    
    public static DBusMessage cbDBusMessageFilterFunction(MemoryAddress connection, MemoryAddress message, boolean incoming, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusMessageFilterFunction) Interop.signalRegistry.get(hash);
        return handler.onDBusMessageFilterFunction(new DBusConnection(References.get(connection, false)), new DBusMessage(References.get(message, true)), incoming);
    }
    
    public static void signalDBusObjectInterfaceAdded(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObject.InterfaceAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObject.DBusObjectImpl(References.get(source)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void signalDBusObjectInterfaceRemoved(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObject.InterfaceRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObject.DBusObjectImpl(References.get(source)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void cbDBusSubtreeIntrospectFunc(MemoryAddress connection, MemoryAddress sender, MemoryAddress objectPath, MemoryAddress node, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusSubtreeIntrospectFunc) Interop.signalRegistry.get(hash);
        handler.onDBusSubtreeIntrospectFunc(new DBusConnection(References.get(connection, false)), sender.getUtf8String(0), objectPath.getUtf8String(0), node.getUtf8String(0));
    }
    
    public static org.gtk.gobject.Type cbDBusProxyTypeFunc(MemoryAddress manager, MemoryAddress objectPath, MemoryAddress interfaceName, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DBusProxyTypeFunc) Interop.signalRegistry.get(hash);
        return handler.onDBusProxyTypeFunc(new DBusObjectManagerClient(References.get(manager, false)), objectPath.getUtf8String(0), interfaceName.getUtf8String(0));
    }
    
    public static boolean signalTlsConnectionAcceptCertificate(MemoryAddress source, MemoryAddress peerCert, int errors, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TlsConnection.AcceptCertificateHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TlsConnection(References.get(source)), new TlsCertificate(References.get(peerCert, false)), errors);
    }
    
    public static void signalDBusObjectManagerInterfaceAdded(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.InterfaceAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void signalDBusObjectManagerInterfaceRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.InterfaceRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void signalDBusObjectManagerObjectAdded(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.ObjectAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)));
    }
    
    public static void signalDBusObjectManagerObjectRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.ObjectRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)));
    }
    
    public static void signalDBusObjectManagerClientInterfaceProxyPropertiesChanged(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManagerClient.InterfaceProxyPropertiesChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManagerClient(References.get(source)), new DBusObjectProxy(References.get(objectProxy, false)), new DBusProxy(References.get(interfaceProxy, false)), new org.gtk.glib.Variant(References.get(changedProperties, false)), null);
    }
    
    public static void signalDBusObjectManagerClientInterfaceProxySignal(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManagerClient.InterfaceProxySignalHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManagerClient(References.get(source)), new DBusObjectProxy(References.get(objectProxy, false)), new DBusProxy(References.get(interfaceProxy, false)), senderName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)));
    }
    
    public static void signalMountChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Mount.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Mount.MountImpl(References.get(source)));
    }
    
    public static void signalMountPreUnmount(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Mount.PreUnmountHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Mount.MountImpl(References.get(source)));
    }
    
    public static void signalMountUnmounted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Mount.UnmountedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Mount.MountImpl(References.get(source)));
    }
    
    public static void cbTaskThreadFunc(MemoryAddress task, MemoryAddress sourceObject, MemoryAddress taskData, MemoryAddress cancellable) {
        int hash = taskData.get(C_INT, 0);
        var handler = (TaskThreadFunc) Interop.signalRegistry.get(hash);
        handler.onTaskThreadFunc(new Task(References.get(task, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)), new Cancellable(References.get(cancellable, false)));
    }
    
    public static boolean signalSocketServiceIncoming(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SocketService.IncomingHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new SocketService(References.get(source)), new SocketConnection(References.get(connection, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)));
    }
    
    public static boolean signalDebugControllerDBusAuthorize(MemoryAddress source, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DebugControllerDBus.AuthorizeHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DebugControllerDBus(References.get(source)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
    public static void cbBusNameAcquiredCallback(MemoryAddress connection, MemoryAddress name, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BusNameAcquiredCallback) Interop.signalRegistry.get(hash);
        handler.onBusNameAcquiredCallback(new DBusConnection(References.get(connection, false)), name.getUtf8String(0));
    }
    
    public static void signalMenuModelItemsChanged(MemoryAddress source, int position, int removed, int added, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MenuModel.ItemsChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new MenuModel(References.get(source)), position, removed, added);
    }
    
    public static void signalResolverReload(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Resolver.ReloadHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Resolver(References.get(source)));
    }
    
    public static void signalDBusConnectionClosed(MemoryAddress source, boolean remotePeerVanished, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusConnection.ClosedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusConnection(References.get(source)), remotePeerVanished, new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static boolean cbIOSchedulerJobFunc(MemoryAddress job, MemoryAddress cancellable, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (IOSchedulerJobFunc) Interop.signalRegistry.get(hash);
        return handler.onIOSchedulerJobFunc(new IOSchedulerJob(References.get(job, false)), new Cancellable(References.get(cancellable, false)));
    }
    
    public static void signalAppLaunchContextLaunchFailed(MemoryAddress source, MemoryAddress startupNotifyId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppLaunchContext.LaunchFailedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppLaunchContext(References.get(source)), startupNotifyId.getUtf8String(0));
    }
    
    public static void signalAppLaunchContextLaunchStarted(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppLaunchContext.LaunchStartedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppLaunchContext(References.get(source)), new AppInfo.AppInfoImpl(References.get(info, false)), new org.gtk.glib.Variant(References.get(platformData, false)));
    }
    
    public static void signalAppLaunchContextLaunched(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppLaunchContext.LaunchedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppLaunchContext(References.get(source)), new AppInfo.AppInfoImpl(References.get(info, false)), new org.gtk.glib.Variant(References.get(platformData, false)));
    }
    
    public static boolean signalDBusInterfaceSkeletonGAuthorizeMethod(MemoryAddress source, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusInterfaceSkeleton.GAuthorizeMethodHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new DBusInterfaceSkeleton(References.get(source)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
    public static void signalAppInfoMonitorChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppInfoMonitor.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppInfoMonitor(References.get(source)));
    }
    
}
