package org.gtk.gobject;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void cbObjectSetPropertyFunc(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
        int hash = pspec.get(C_INT, 0);
        var handler = (ObjectSetPropertyFunc) signalRegistry.get(hash);
        handler.onObjectSetPropertyFunc(new Object(References.get(object, false)), propertyId, new Value(References.get(value, false)));
    }
    
    public static void cbToggleNotify(MemoryAddress data, MemoryAddress object, boolean isLastRef) {
        int hash = isLastRef.get(C_INT, 0);
        var handler = (ToggleNotify) signalRegistry.get(hash);
        handler.onToggleNotify(data, new Object(References.get(object, false)));
    }
    
    public static void cbClassInitFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(C_INT, 0);
        var handler = (ClassInitFunc) signalRegistry.get(hash);
        handler.onClassInitFunc(new TypeClass(References.get(gClass, false)));
    }
    
    public static void cbBoxedFreeFunc(MemoryAddress boxed) {
        int hash = boxed.get(C_INT, 0);
        var handler = (BoxedFreeFunc) signalRegistry.get(hash);
        handler.onBoxedFreeFunc();
    }
    
    public static void cbInterfaceInitFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(C_INT, 0);
        var handler = (InterfaceInitFunc) signalRegistry.get(hash);
        handler.onInterfaceInitFunc(new TypeInterface(References.get(gIface, false)));
    }
    
    public static void cbSignalAccumulator(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalAccumulator) signalRegistry.get(hash);
        handler.onSignalAccumulator(new SignalInvocationHint(References.get(ihint, false)), new Value(References.get(returnAccu, false)), new Value(References.get(handlerReturn, false)));
    }
    
    public static void signalObjectNotify(MemoryAddress source, MemoryAddress pspec, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Object.NotifyHandler) signalRegistry.get(hash);
        handler.signalReceived(new Object(References.get(source)), new ParamSpec(References.get(pspec, false)));
    }
    
    public static void cbClosureMarshal(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress marshalData) {
        int hash = marshalData.get(C_INT, 0);
        var handler = (ClosureMarshal) signalRegistry.get(hash);
        handler.onClosureMarshal(new Closure(References.get(closure, false)), new Value(References.get(returnValue, false)), nParamValues, null, invocationHint);
    }
    
    public static void cbBaseInitFunc(MemoryAddress gClass) {
        int hash = gClass.get(C_INT, 0);
        var handler = (BaseInitFunc) signalRegistry.get(hash);
        handler.onBaseInitFunc();
    }
    
    public static void cbTypePluginUse(MemoryAddress plugin) {
        int hash = plugin.get(C_INT, 0);
        var handler = (TypePluginUse) signalRegistry.get(hash);
        handler.onTypePluginUse();
    }
    
    public static void cbObjectFinalizeFunc(MemoryAddress object) {
        int hash = object.get(C_INT, 0);
        var handler = (ObjectFinalizeFunc) signalRegistry.get(hash);
        handler.onObjectFinalizeFunc();
    }
    
    public static void cbObjectGetPropertyFunc(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
        int hash = pspec.get(C_INT, 0);
        var handler = (ObjectGetPropertyFunc) signalRegistry.get(hash);
        handler.onObjectGetPropertyFunc(new Object(References.get(object, false)), propertyId, new Value(References.get(value, false)));
    }
    
    public static void cbInstanceInitFunc(MemoryAddress instance, MemoryAddress gClass) {
        int hash = gClass.get(C_INT, 0);
        var handler = (InstanceInitFunc) signalRegistry.get(hash);
        handler.onInstanceInitFunc(new TypeInstance(References.get(instance, false)));
    }
    
    public static void cbClosureNotify(MemoryAddress data, MemoryAddress closure) {
        int hash = closure.get(C_INT, 0);
        var handler = (ClosureNotify) signalRegistry.get(hash);
        handler.onClosureNotify(data);
    }
    
    public static void cbTypeClassCacheFunc(MemoryAddress cacheData, MemoryAddress gClass) {
        int hash = gClass.get(C_INT, 0);
        var handler = (TypeClassCacheFunc) signalRegistry.get(hash);
        handler.onTypeClassCacheFunc(cacheData);
    }
    
    public static void signalSignalGroupBind(MemoryAddress source, MemoryAddress instance, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalGroup.BindHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalGroup(References.get(source)), new Object(References.get(instance, false)));
    }
    
    public static void signalSignalGroupUnbind(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalGroup.UnbindHandler) signalRegistry.get(hash);
        handler.signalReceived(new SignalGroup(References.get(source)));
    }
    
    public static void cbTypePluginCompleteInterfaceInfo(MemoryAddress plugin, MemoryAddress instanceType, MemoryAddress interfaceType, MemoryAddress info) {
        int hash = info.get(C_INT, 0);
        var handler = (TypePluginCompleteInterfaceInfo) signalRegistry.get(hash);
        handler.onTypePluginCompleteInterfaceInfo(new TypePlugin.TypePluginImpl(References.get(plugin, false)), org.gtk.gobject.Type.fromValue(instanceType), org.gtk.gobject.Type.fromValue(interfaceType));
    }
    
    public static void cbBindingTransformFunc(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (BindingTransformFunc) signalRegistry.get(hash);
        handler.onBindingTransformFunc(new Binding(References.get(binding, false)), new Value(References.get(fromValue, false)), new Value(References.get(toValue, false)));
    }
    
    public static void cbBaseFinalizeFunc(MemoryAddress gClass) {
        int hash = gClass.get(C_INT, 0);
        var handler = (BaseFinalizeFunc) signalRegistry.get(hash);
        handler.onBaseFinalizeFunc();
    }
    
    public static void cbClassFinalizeFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(C_INT, 0);
        var handler = (ClassFinalizeFunc) signalRegistry.get(hash);
        handler.onClassFinalizeFunc(new TypeClass(References.get(gClass, false)));
    }
    
    public static void cbTypePluginUnuse(MemoryAddress plugin) {
        int hash = plugin.get(C_INT, 0);
        var handler = (TypePluginUnuse) signalRegistry.get(hash);
        handler.onTypePluginUnuse();
    }
    
    public static void cbTypePluginCompleteTypeInfo(MemoryAddress plugin, MemoryAddress gType, MemoryAddress info, MemoryAddress valueTable) {
        int hash = valueTable.get(C_INT, 0);
        var handler = (TypePluginCompleteTypeInfo) signalRegistry.get(hash);
        handler.onTypePluginCompleteTypeInfo(new TypePlugin.TypePluginImpl(References.get(plugin, false)), org.gtk.gobject.Type.fromValue(gType), new TypeInfo(References.get(info, false)));
    }
    
    public static void cbSignalEmissionHook(MemoryAddress ihint, int nParamValues, MemoryAddress paramValues, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SignalEmissionHook) signalRegistry.get(hash);
        handler.onSignalEmissionHook(new SignalInvocationHint(References.get(ihint, false)), nParamValues, null);
    }
    
    public static void cbInterfaceFinalizeFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(C_INT, 0);
        var handler = (InterfaceFinalizeFunc) signalRegistry.get(hash);
        handler.onInterfaceFinalizeFunc(new TypeInterface(References.get(gIface, false)));
    }
    
    public static void cbValueTransform(MemoryAddress srcValue, MemoryAddress destValue) {
        int hash = destValue.get(C_INT, 0);
        var handler = (ValueTransform) signalRegistry.get(hash);
        handler.onValueTransform(new Value(References.get(srcValue, false)));
    }
    
    public static void cbBoxedCopyFunc(MemoryAddress boxed) {
        int hash = boxed.get(C_INT, 0);
        var handler = (BoxedCopyFunc) signalRegistry.get(hash);
        handler.onBoxedCopyFunc();
    }
    
    public static void cbWeakNotify(MemoryAddress data, MemoryAddress whereTheObjectWas) {
        int hash = whereTheObjectWas.get(C_INT, 0);
        var handler = (WeakNotify) signalRegistry.get(hash);
        handler.onWeakNotify(data);
    }
    
    public static void cbCallback() {
        int hash = .get(C_INT, 0);
        var handler = (Callback) signalRegistry.get(hash);
        handler.onCallback();
    }
    
    public static void cbTypeInterfaceCheckFunc(MemoryAddress checkData, MemoryAddress gIface) {
        int hash = gIface.get(C_INT, 0);
        var handler = (TypeInterfaceCheckFunc) signalRegistry.get(hash);
        handler.onTypeInterfaceCheckFunc(checkData);
    }
    
}
