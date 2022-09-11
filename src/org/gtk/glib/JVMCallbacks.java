package org.gtk.glib;

import jdk.incubator.foreign.*;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static boolean cbHookCheckFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (HookCheckFunc) Interop.signalRegistry.get(hash);
        return handler.onHookCheckFunc();
    }
    
    public static boolean cbIOFunc(MemoryAddress source, int condition, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IOFunc) Interop.signalRegistry.get(hash);
        return handler.onIOFunc(new IOChannel(References.get(source, false)), condition);
    }
    
    public static jdk.incubator.foreign.MemoryAddress cbThreadFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ThreadFunc) Interop.signalRegistry.get(hash);
        return handler.onThreadFunc();
    }
    
    public static boolean cbHookCheckMarshaller(MemoryAddress hook, MemoryAddress marshalData) {
        int hash = marshalData.get(C_INT, 0);
        var handler = (HookCheckMarshaller) Interop.signalRegistry.get(hash);
        return handler.onHookCheckMarshaller(new Hook(References.get(hook, false)));
    }
    
    public static boolean cbNodeTraverseFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NodeTraverseFunc) Interop.signalRegistry.get(hash);
        return handler.onNodeTraverseFunc(new Node(References.get(node, false)));
    }
    
    public static void cbHookFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (HookFunc) Interop.signalRegistry.get(hash);
        handler.onHookFunc();
    }
    
    public static void cbTestFixtureFunc(MemoryAddress fixture, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TestFixtureFunc) Interop.signalRegistry.get(hash);
        handler.onTestFixtureFunc(fixture);
    }
    
    public static jdk.incubator.foreign.MemoryAddress cbCopyFunc(MemoryAddress src, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CopyFunc) Interop.signalRegistry.get(hash);
        return handler.onCopyFunc(src);
    }
    
    public static boolean cbHookFindFunc(MemoryAddress hook, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (HookFindFunc) Interop.signalRegistry.get(hash);
        return handler.onHookFindFunc(new Hook(References.get(hook, false)));
    }
    
    public static boolean cbRegexEvalCallback(MemoryAddress matchInfo, MemoryAddress result, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (RegexEvalCallback) Interop.signalRegistry.get(hash);
        return handler.onRegexEvalCallback(new MatchInfo(References.get(matchInfo, false)), new String(References.get(result, false)));
    }
    
    public static boolean cbUnixFDSourceFunc(int fd, int condition, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnixFDSourceFunc) Interop.signalRegistry.get(hash);
        return handler.onUnixFDSourceFunc(fd, condition);
    }
    
    public static void cbSpawnChildSetupFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SpawnChildSetupFunc) Interop.signalRegistry.get(hash);
        handler.onSpawnChildSetupFunc();
    }
    
    public static void cbDestroyNotify(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DestroyNotify) Interop.signalRegistry.get(hash);
        handler.onDestroyNotify();
    }
    
    public static void cbChildWatchFunc(MemoryAddress pid, int waitStatus, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ChildWatchFunc) Interop.signalRegistry.get(hash);
        handler.onChildWatchFunc(Pid.fromValue(pid), waitStatus);
    }
    
    public static void cbTestDataFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TestDataFunc) Interop.signalRegistry.get(hash);
        handler.onTestDataFunc();
    }
    
    public static int cbCompareDataFunc(MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (CompareDataFunc) Interop.signalRegistry.get(hash);
        return handler.onCompareDataFunc(a, b);
    }
    
    public static boolean cbTraverseFunc(MemoryAddress key, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TraverseFunc) Interop.signalRegistry.get(hash);
        return handler.onTraverseFunc(key, value);
    }
    
    public static void cbFunc(MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (Func) Interop.signalRegistry.get(hash);
        handler.onFunc();
    }
    
    public static LogWriterOutput cbLogWriterFunc(int logLevel, MemoryAddress fields, long nFields, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (LogWriterFunc) Interop.signalRegistry.get(hash);
        return handler.onLogWriterFunc(logLevel, null, nFields);
    }
    
    public static int cbSequenceIterCompareFunc(MemoryAddress a, MemoryAddress b, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SequenceIterCompareFunc) Interop.signalRegistry.get(hash);
        return handler.onSequenceIterCompareFunc(new SequenceIter(References.get(a, false)), new SequenceIter(References.get(b, false)));
    }
    
    public static void cbHookMarshaller(MemoryAddress hook, MemoryAddress marshalData) {
        int hash = marshalData.get(C_INT, 0);
        var handler = (HookMarshaller) Interop.signalRegistry.get(hash);
        handler.onHookMarshaller(new Hook(References.get(hook, false)));
    }
    
    public static boolean cbOptionParseFunc(MemoryAddress context, MemoryAddress group, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (OptionParseFunc) Interop.signalRegistry.get(hash);
        return handler.onOptionParseFunc(new OptionContext(References.get(context, false)), new OptionGroup(References.get(group, false)));
    }
    
    public static boolean cbOptionArgFunc(MemoryAddress optionName, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (OptionArgFunc) Interop.signalRegistry.get(hash);
        return handler.onOptionArgFunc(optionName.getUtf8String(0), value.getUtf8String(0));
    }
    
    public static boolean cbTestLogFatalFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TestLogFatalFunc) Interop.signalRegistry.get(hash);
        return handler.onTestLogFatalFunc(logDomain.getUtf8String(0), logLevel, message.getUtf8String(0));
    }
    
    public static boolean cbSourceFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SourceFunc) Interop.signalRegistry.get(hash);
        return handler.onSourceFunc();
    }
    
    public static void cbOptionErrorFunc(MemoryAddress context, MemoryAddress group, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (OptionErrorFunc) Interop.signalRegistry.get(hash);
        handler.onOptionErrorFunc(new OptionContext(References.get(context, false)), new OptionGroup(References.get(group, false)));
    }
    
    public static boolean cbTraverseNodeFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TraverseNodeFunc) Interop.signalRegistry.get(hash);
        return handler.onTraverseNodeFunc(new TreeNode(References.get(node, false)));
    }
    
    public static void cbHFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (HFunc) Interop.signalRegistry.get(hash);
        handler.onHFunc(key, value);
    }
    
    public static jdk.incubator.foreign.MemoryAddress cbDuplicateFunc(MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DuplicateFunc) Interop.signalRegistry.get(hash);
        return handler.onDuplicateFunc();
    }
    
    public static void cbFreeFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FreeFunc) Interop.signalRegistry.get(hash);
        handler.onFreeFunc();
    }
    
    public static boolean cbHRFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (HRFunc) Interop.signalRegistry.get(hash);
        return handler.onHRFunc(key, value);
    }
    
    public static void cbLogFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (LogFunc) Interop.signalRegistry.get(hash);
        handler.onLogFunc(logDomain.getUtf8String(0), logLevel, message.getUtf8String(0));
    }
    
    public static void cbNodeForeachFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NodeForeachFunc) Interop.signalRegistry.get(hash);
        handler.onNodeForeachFunc(new Node(References.get(node, false)));
    }
    
    public static void cbDataForeachFunc(MemoryAddress keyId, MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DataForeachFunc) Interop.signalRegistry.get(hash);
        handler.onDataForeachFunc(Quark.fromValue(keyId));
    }
    
    public static java.lang.String cbTranslateFunc(MemoryAddress str, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TranslateFunc) Interop.signalRegistry.get(hash);
        return handler.onTranslateFunc(str.getUtf8String(0));
    }
    
}
