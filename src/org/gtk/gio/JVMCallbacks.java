package org.gtk.gio;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static boolean signalDBusServerNewConnection(MemoryAddress source, MemoryAddress connection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusServer.NewConnectionHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DBusServer(References.get(source)), new DBusConnection(References.get(connection, false)));
    }
    
    public static boolean signalDBusObjectSkeletonAuthorizeMethod(MemoryAddress source, MemoryAddress interface_, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectSkeleton.AuthorizeMethodHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DBusObjectSkeleton(References.get(source)), new DBusInterfaceSkeleton(References.get(interface_, false)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
    public static void signalUnixMountMonitorMountpointsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (UnixMountMonitor.MountpointsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new UnixMountMonitor(References.get(source)));
    }
    
    public static void signalUnixMountMonitorMountsChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (UnixMountMonitor.MountsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new UnixMountMonitor(References.get(source)));
    }
    
    public static void signalMemoryMonitorLowMemoryWarning(MemoryAddress source, int level, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MemoryMonitor.LowMemoryWarningHandler) signalRegistry.get(hash);
        handler.signalReceived(new MemoryMonitor.MemoryMonitorImpl(References.get(source)), MemoryMonitorWarningLevel.fromValue(level));
    }
    
    public static void signalListModelItemsChanged(MemoryAddress source, int position, int removed, int added, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ListModel.ItemsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ListModel.ListModelImpl(References.get(source)), position, removed, added);
    }
    
    public static void signalDBusProxyGPropertiesChanged(MemoryAddress source, MemoryAddress changedProperties, MemoryAddress invalidatedProperties, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusProxy.GPropertiesChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusProxy(References.get(source)), new org.gtk.glib.Variant(References.get(changedProperties, false)), null);
    }
    
    public static void signalDBusProxyGSignal(MemoryAddress source, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusProxy.GSignalHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusProxy(References.get(source)), senderName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)));
    }
    
    public static boolean signalDBusAuthObserverAllowMechanism(MemoryAddress source, MemoryAddress mechanism, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusAuthObserver.AllowMechanismHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DBusAuthObserver(References.get(source)), mechanism.getUtf8String(0));
    }
    
    public static boolean signalDBusAuthObserverAuthorizeAuthenticatedPeer(MemoryAddress source, MemoryAddress stream, MemoryAddress credentials, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusAuthObserver.AuthorizeAuthenticatedPeerHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DBusAuthObserver(References.get(source)), new IOStream(References.get(stream, false)), new Credentials(References.get(credentials, false)));
    }
    
    public static boolean signalDtlsConnectionAcceptCertificate(MemoryAddress source, MemoryAddress peerCert, int errors, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DtlsConnection.AcceptCertificateHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DtlsConnection.DtlsConnectionImpl(References.get(source)), new TlsCertificate(References.get(peerCert, false)), errors);
    }
    
    public static boolean signalSettingsChangeEvent(MemoryAddress source, MemoryAddress keys, int nKeys, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.ChangeEventHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Settings(References.get(source)), null, nKeys);
    }
    
    public static void signalSettingsChanged(MemoryAddress source, MemoryAddress key, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Settings(References.get(source)), key.getUtf8String(0));
    }
    
    public static boolean signalSettingsWritableChangeEvent(MemoryAddress source, int key, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.WritableChangeEventHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Settings(References.get(source)), key);
    }
    
    public static void signalSettingsWritableChanged(MemoryAddress source, MemoryAddress key, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Settings.WritableChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Settings(References.get(source)), key.getUtf8String(0));
    }
    
    public static void signalVolumeMonitorDriveChanged(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveConnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveConnectedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveDisconnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveDisconnectedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveEjectButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveEjectButtonHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorDriveStopButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.DriveStopButtonHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Drive.DriveImpl(References.get(drive, false)));
    }
    
    public static void signalVolumeMonitorMountAdded(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorMountChanged(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorMountPreUnmount(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountPreUnmountHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorMountRemoved(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.MountRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Mount.MountImpl(References.get(mount, false)));
    }
    
    public static void signalVolumeMonitorVolumeAdded(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.VolumeAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Volume.VolumeImpl(References.get(volume, false)));
    }
    
    public static void signalVolumeMonitorVolumeChanged(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.VolumeChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Volume.VolumeImpl(References.get(volume, false)));
    }
    
    public static void signalVolumeMonitorVolumeRemoved(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (VolumeMonitor.VolumeRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new VolumeMonitor(References.get(source)), new Volume.VolumeImpl(References.get(volume, false)));
    }
    
    public static void signalApplicationActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationCommandLine(MemoryAddress source, MemoryAddress commandLine, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.CommandLineHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), new ApplicationCommandLine(References.get(commandLine, false)));
    }
    
    public static void signalApplicationHandleLocalOptions(MemoryAddress source, MemoryAddress options, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.HandleLocalOptionsHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), new org.gtk.glib.VariantDict(References.get(options, false)));
    }
    
    public static boolean signalApplicationNameLost(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.NameLostHandler) signalRegistry.get(hash);
        return handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationOpen(MemoryAddress source, MemoryAddress files, int nFiles, MemoryAddress hint, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.OpenHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)), null, nFiles, hint.getUtf8String(0));
    }
    
    public static void signalApplicationShutdown(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.ShutdownHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalApplicationStartup(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Application.StartupHandler) signalRegistry.get(hash);
        handler.signalReceived(new Application(References.get(source)));
    }
    
    public static void signalMountOperationAborted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.AbortedHandler) signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)));
    }
    
    public static void signalMountOperationAskPassword(MemoryAddress source, MemoryAddress message, MemoryAddress defaultUser, MemoryAddress defaultDomain, int flags, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.AskPasswordHandler) signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), defaultUser.getUtf8String(0), defaultDomain.getUtf8String(0), flags);
    }
    
    public static void signalMountOperationAskQuestion(MemoryAddress source, MemoryAddress message, MemoryAddress choices, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.AskQuestionHandler) signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), null);
    }
    
    public static void signalMountOperationReply(MemoryAddress source, int result, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.ReplyHandler) signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), MountOperationResult.fromValue(result));
    }
    
    public static void signalMountOperationShowProcesses(MemoryAddress source, MemoryAddress message, MemoryAddress processes, MemoryAddress choices, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.ShowProcessesHandler) signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), null, null);
    }
    
    public static void signalMountOperationShowUnmountProgress(MemoryAddress source, MemoryAddress message, long timeLeft, long bytesLeft, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MountOperation.ShowUnmountProgressHandler) signalRegistry.get(hash);
        handler.signalReceived(new MountOperation(References.get(source)), message.getUtf8String(0), timeLeft, bytesLeft);
    }
    
    public static void signalActionGroupActionAdded(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0));
    }
    
    public static void signalActionGroupActionEnabledChanged(MemoryAddress source, MemoryAddress actionName, boolean enabled, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionEnabledChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0), enabled);
    }
    
    public static void signalActionGroupActionRemoved(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0));
    }
    
    public static void signalActionGroupActionStateChanged(MemoryAddress source, MemoryAddress actionName, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionStateChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0), new org.gtk.glib.Variant(References.get(value, false)));
    }
    
    public static void signalVolumeChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Volume.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Volume.VolumeImpl(References.get(source)));
    }
    
    public static void signalVolumeRemoved(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Volume.RemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Volume.VolumeImpl(References.get(source)));
    }
    
    public static void signalFileMonitorChanged(MemoryAddress source, MemoryAddress file, MemoryAddress otherFile, int eventType, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FileMonitor.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new FileMonitor(References.get(source)), new File.FileImpl(References.get(file, false)), new File.FileImpl(References.get(otherFile, false)), FileMonitorEvent.fromValue(eventType));
    }
    
    public static void signalSocketClientEvent(MemoryAddress source, int event, MemoryAddress connectable, MemoryAddress connection, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SocketClient.EventHandler) signalRegistry.get(hash);
        handler.signalReceived(new SocketClient(References.get(source)), SocketClientEvent.fromValue(event), new SocketConnectable.SocketConnectableImpl(References.get(connectable, false)), new IOStream(References.get(connection, false)));
    }
    
    public static void signalSocketListenerEvent(MemoryAddress source, int event, MemoryAddress socket, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SocketListener.EventHandler) signalRegistry.get(hash);
        handler.signalReceived(new SocketListener(References.get(source)), SocketListenerEvent.fromValue(event), new Socket(References.get(socket, false)));
    }
    
    public static void signalDriveChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalDriveDisconnected(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.DisconnectedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalDriveEjectButton(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.EjectButtonHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalDriveStopButton(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Drive.StopButtonHandler) signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    public static void signalSimpleActionActivate(MemoryAddress source, MemoryAddress parameter, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SimpleAction.ActivateHandler) signalRegistry.get(hash);
        handler.signalReceived(new SimpleAction(References.get(source)), new org.gtk.glib.Variant(References.get(parameter, false)));
    }
    
    public static void signalSimpleActionChangeState(MemoryAddress source, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SimpleAction.ChangeStateHandler) signalRegistry.get(hash);
        handler.signalReceived(new SimpleAction(References.get(source)), new org.gtk.glib.Variant(References.get(value, false)));
    }
    
    public static void signalFilenameCompleterGotCompletionData(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FilenameCompleter.GotCompletionDataHandler) signalRegistry.get(hash);
        handler.signalReceived(new FilenameCompleter(References.get(source)));
    }
    
    public static boolean signalThreadedSocketServiceRun(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ThreadedSocketService.RunHandler) signalRegistry.get(hash);
        return handler.signalReceived(new ThreadedSocketService(References.get(source)), new SocketConnection(References.get(connection, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)));
    }
    
    public static void signalCancellableCancelled(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Cancellable.CancelledHandler) signalRegistry.get(hash);
        handler.signalReceived(new Cancellable(References.get(source)));
    }
    
    public static void signalNetworkMonitorNetworkChanged(MemoryAddress source, boolean networkAvailable, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NetworkMonitor.NetworkChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new NetworkMonitor.NetworkMonitorImpl(References.get(source)), networkAvailable);
    }
    
    public static void signalDBusObjectInterfaceAdded(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObject.InterfaceAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObject.DBusObjectImpl(References.get(source)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void signalDBusObjectInterfaceRemoved(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObject.InterfaceRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObject.DBusObjectImpl(References.get(source)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static boolean signalTlsConnectionAcceptCertificate(MemoryAddress source, MemoryAddress peerCert, int errors, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TlsConnection.AcceptCertificateHandler) signalRegistry.get(hash);
        return handler.signalReceived(new TlsConnection(References.get(source)), new TlsCertificate(References.get(peerCert, false)), errors);
    }
    
    public static void signalDBusObjectManagerInterfaceAdded(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.InterfaceAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void signalDBusObjectManagerInterfaceRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.InterfaceRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    public static void signalDBusObjectManagerObjectAdded(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.ObjectAddedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)));
    }
    
    public static void signalDBusObjectManagerObjectRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManager.ObjectRemovedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)));
    }
    
    public static void signalDBusObjectManagerClientInterfaceProxyPropertiesChanged(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManagerClient.InterfaceProxyPropertiesChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManagerClient(References.get(source)), new DBusObjectProxy(References.get(objectProxy, false)), new DBusProxy(References.get(interfaceProxy, false)), new org.gtk.glib.Variant(References.get(changedProperties, false)), null);
    }
    
    public static void signalDBusObjectManagerClientInterfaceProxySignal(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObjectManagerClient.InterfaceProxySignalHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusObjectManagerClient(References.get(source)), new DBusObjectProxy(References.get(objectProxy, false)), new DBusProxy(References.get(interfaceProxy, false)), senderName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(References.get(parameters, false)));
    }
    
    public static void signalMountChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Mount.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Mount.MountImpl(References.get(source)));
    }
    
    public static void signalMountPreUnmount(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Mount.PreUnmountHandler) signalRegistry.get(hash);
        handler.signalReceived(new Mount.MountImpl(References.get(source)));
    }
    
    public static void signalMountUnmounted(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Mount.UnmountedHandler) signalRegistry.get(hash);
        handler.signalReceived(new Mount.MountImpl(References.get(source)));
    }
    
    public static boolean signalSocketServiceIncoming(MemoryAddress source, MemoryAddress connection, MemoryAddress sourceObject, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SocketService.IncomingHandler) signalRegistry.get(hash);
        return handler.signalReceived(new SocketService(References.get(source)), new SocketConnection(References.get(connection, false)), new org.gtk.gobject.Object(References.get(sourceObject, false)));
    }
    
    public static boolean signalDebugControllerDBusAuthorize(MemoryAddress source, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DebugControllerDBus.AuthorizeHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DebugControllerDBus(References.get(source)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
    public static void signalMenuModelItemsChanged(MemoryAddress source, int position, int removed, int added, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (MenuModel.ItemsChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new MenuModel(References.get(source)), position, removed, added);
    }
    
    public static void signalResolverReload(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Resolver.ReloadHandler) signalRegistry.get(hash);
        handler.signalReceived(new Resolver(References.get(source)));
    }
    
    public static void signalDBusConnectionClosed(MemoryAddress source, boolean remotePeerVanished, MemoryAddress error, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusConnection.ClosedHandler) signalRegistry.get(hash);
        handler.signalReceived(new DBusConnection(References.get(source)), remotePeerVanished, new org.gtk.glib.Error(References.get(error, false)));
    }
    
    public static void signalAppLaunchContextLaunchFailed(MemoryAddress source, MemoryAddress startupNotifyId, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppLaunchContext.LaunchFailedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppLaunchContext(References.get(source)), startupNotifyId.getUtf8String(0));
    }
    
    public static void signalAppLaunchContextLaunchStarted(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppLaunchContext.LaunchStartedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppLaunchContext(References.get(source)), new AppInfo.AppInfoImpl(References.get(info, false)), new org.gtk.glib.Variant(References.get(platformData, false)));
    }
    
    public static void signalAppLaunchContextLaunched(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppLaunchContext.LaunchedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppLaunchContext(References.get(source)), new AppInfo.AppInfoImpl(References.get(info, false)), new org.gtk.glib.Variant(References.get(platformData, false)));
    }
    
    public static boolean signalDBusInterfaceSkeletonGAuthorizeMethod(MemoryAddress source, MemoryAddress invocation, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusInterfaceSkeleton.GAuthorizeMethodHandler) signalRegistry.get(hash);
        return handler.signalReceived(new DBusInterfaceSkeleton(References.get(source)), new DBusMethodInvocation(References.get(invocation, false)));
    }
    
    public static void signalAppInfoMonitorChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (AppInfoMonitor.ChangedHandler) signalRegistry.get(hash);
        handler.signalReceived(new AppInfoMonitor(References.get(source)));
    }
    
}
