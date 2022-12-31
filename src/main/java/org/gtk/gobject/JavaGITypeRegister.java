package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

final class JavaGITypeRegister {
    
    static void register() {
        Interop.typeRegister.put(Binding.getType(), Binding.fromAddress);
        Interop.typeRegister.put(BindingGroup.getType(), BindingGroup.fromAddress);
        Interop.typeRegister.put(InitiallyUnowned.getType(), InitiallyUnowned.fromAddress);
        Interop.typeRegister.put(GObject.getType(), GObject.fromAddress);
        Interop.typeRegister.put(ParamSpec.getType(), ParamSpec.fromAddress);
        Interop.typeRegister.put(ParamSpecBoolean.getType(), ParamSpecBoolean.fromAddress);
        Interop.typeRegister.put(ParamSpecBoxed.getType(), ParamSpecBoxed.fromAddress);
        Interop.typeRegister.put(ParamSpecChar.getType(), ParamSpecChar.fromAddress);
        Interop.typeRegister.put(ParamSpecDouble.getType(), ParamSpecDouble.fromAddress);
        Interop.typeRegister.put(ParamSpecEnum.getType(), ParamSpecEnum.fromAddress);
        Interop.typeRegister.put(ParamSpecFlags.getType(), ParamSpecFlags.fromAddress);
        Interop.typeRegister.put(ParamSpecFloat.getType(), ParamSpecFloat.fromAddress);
        Interop.typeRegister.put(ParamSpecGType.getType(), ParamSpecGType.fromAddress);
        Interop.typeRegister.put(ParamSpecInt.getType(), ParamSpecInt.fromAddress);
        Interop.typeRegister.put(ParamSpecInt64.getType(), ParamSpecInt64.fromAddress);
        Interop.typeRegister.put(ParamSpecLong.getType(), ParamSpecLong.fromAddress);
        Interop.typeRegister.put(ParamSpecObject.getType(), ParamSpecObject.fromAddress);
        Interop.typeRegister.put(ParamSpecOverride.getType(), ParamSpecOverride.fromAddress);
        Interop.typeRegister.put(ParamSpecParam.getType(), ParamSpecParam.fromAddress);
        Interop.typeRegister.put(ParamSpecPointer.getType(), ParamSpecPointer.fromAddress);
        Interop.typeRegister.put(ParamSpecString.getType(), ParamSpecString.fromAddress);
        Interop.typeRegister.put(ParamSpecUChar.getType(), ParamSpecUChar.fromAddress);
        Interop.typeRegister.put(ParamSpecUInt.getType(), ParamSpecUInt.fromAddress);
        Interop.typeRegister.put(ParamSpecUInt64.getType(), ParamSpecUInt64.fromAddress);
        Interop.typeRegister.put(ParamSpecULong.getType(), ParamSpecULong.fromAddress);
        Interop.typeRegister.put(ParamSpecUnichar.getType(), ParamSpecUnichar.fromAddress);
        Interop.typeRegister.put(ParamSpecValueArray.getType(), ParamSpecValueArray.fromAddress);
        Interop.typeRegister.put(ParamSpecVariant.getType(), ParamSpecVariant.fromAddress);
        Interop.typeRegister.put(SignalGroup.getType(), SignalGroup.fromAddress);
        Interop.typeRegister.put(TypeModule.getType(), TypeModule.fromAddress);
        Interop.typeRegister.put(TypePlugin.getType(), TypePlugin.fromAddress);
    }
}
