package org.gtk.gobject;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static void cbToggleNotify(MemoryAddress data, MemoryAddress object, boolean isLastRef) {
        int hash = data.get(C_INT, 0);
        var handler = (ToggleNotify) Interop.signalRegistry.get(hash);
        handler.onToggleNotify(new Object(References.get(object, false)), isLastRef);
    }
    
    public static void cbClassInitFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(C_INT, 0);
        var handler = (ClassInitFunc) Interop.signalRegistry.get(hash);
        handler.onClassInitFunc(new TypeClass(References.get(gClass, false)));
    }
    
    public static void cbInterfaceInitFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(C_INT, 0);
        var handler = (InterfaceInitFunc) Interop.signalRegistry.get(hash);
        handler.onInterfaceInitFunc(new TypeInterface(References.get(gIface, false)));
    }
    
    public static boolean cbSignalAccumulator(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalAccumulator) Interop.signalRegistry.get(hash);
        return handler.onSignalAccumulator(new SignalInvocationHint(References.get(ihint, false)), new Value(References.get(returnAccu, false)), new Value(References.get(handlerReturn, false)));
    }
    
    public static void signalObjectNotify(MemoryAddress source, MemoryAddress pspec, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Object.NotifyHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Object(References.get(source)), new ParamSpec(References.get(pspec, false)));
    }
    
    public static void cbClosureMarshal(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress marshalData) {
        int hash = marshalData.get(C_INT, 0);
        var handler = (ClosureMarshal) Interop.signalRegistry.get(hash);
        handler.onClosureMarshal(new Closure(References.get(closure, false)), new Value(References.get(returnValue, false)), nParamValues, null, invocationHint);
    }
    
    public static void cbClosureNotify(MemoryAddress data, MemoryAddress closure) {
        int hash = data.get(C_INT, 0);
        var handler = (ClosureNotify) Interop.signalRegistry.get(hash);
        handler.onClosureNotify(new Closure(References.get(closure, false)));
    }
    
    public static boolean cbTypeClassCacheFunc(MemoryAddress cacheData, MemoryAddress gClass) {
        int hash = cacheData.get(C_INT, 0);
        var handler = (TypeClassCacheFunc) Interop.signalRegistry.get(hash);
        return handler.onTypeClassCacheFunc(new TypeClass(References.get(gClass, false)));
    }
    
    public static void signalSignalGroupBind(MemoryAddress source, MemoryAddress instance, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalGroup.BindHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalGroup(References.get(source)), new Object(References.get(instance, false)));
    }
    
    public static void signalSignalGroupUnbind(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalGroup.UnbindHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new SignalGroup(References.get(source)));
    }
    
    public static boolean cbBindingTransformFunc(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BindingTransformFunc) Interop.signalRegistry.get(hash);
        return handler.onBindingTransformFunc(new Binding(References.get(binding, false)), new Value(References.get(fromValue, false)), new Value(References.get(toValue, false)));
    }
    
    public static void cbClassFinalizeFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(C_INT, 0);
        var handler = (ClassFinalizeFunc) Interop.signalRegistry.get(hash);
        handler.onClassFinalizeFunc(new TypeClass(References.get(gClass, false)));
    }
    
    public static boolean cbSignalEmissionHook(MemoryAddress ihint, int nParamValues, MemoryAddress paramValues, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalEmissionHook) Interop.signalRegistry.get(hash);
        return handler.onSignalEmissionHook(new SignalInvocationHint(References.get(ihint, false)), nParamValues, null);
    }
    
    public static void cbInterfaceFinalizeFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(C_INT, 0);
        var handler = (InterfaceFinalizeFunc) Interop.signalRegistry.get(hash);
        handler.onInterfaceFinalizeFunc(new TypeInterface(References.get(gIface, false)));
    }
    
    public static void cbWeakNotify(MemoryAddress data, MemoryAddress whereTheObjectWas) {
        int hash = data.get(C_INT, 0);
        var handler = (WeakNotify) Interop.signalRegistry.get(hash);
        handler.onWeakNotify(new Object(References.get(whereTheObjectWas, false)));
    }
    
    public static void cbTypeInterfaceCheckFunc(MemoryAddress checkData, MemoryAddress gIface) {
        int hash = checkData.get(C_INT, 0);
        var handler = (TypeInterfaceCheckFunc) Interop.signalRegistry.get(hash);
        handler.onTypeInterfaceCheckFunc(new TypeInterface(References.get(gIface, false)));
    }
    
}
