package org.gtk.glib;

import jdk.incubator.foreign.*;
import java.util.HashMap;
import io.github.jwharm.javagi.interop.*;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;

public final class JVMCallbacks {
    
    public static final HashMap<java.lang.Integer, java.lang.Object> signalRegistry = new HashMap<>();
    
    public static void cbClearHandleFunc(int handleId) {
        int hash = handleId.get(C_INT, 0);
        var handler = (ClearHandleFunc) signalRegistry.get(hash);
        handler.onClearHandleFunc();
    }
    
    public static void cbHookCheckFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (HookCheckFunc) signalRegistry.get(hash);
        handler.onHookCheckFunc();
    }
    
    public static void cbIOFunc(MemoryAddress source, int condition, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (IOFunc) signalRegistry.get(hash);
        handler.onIOFunc(new IOChannel(References.get(source, false)), condition);
    }
    
    public static void cbThreadFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ThreadFunc) signalRegistry.get(hash);
        handler.onThreadFunc();
    }
    
    public static void cbHookCheckMarshaller(MemoryAddress hook, MemoryAddress marshalData) {
        int hash = marshalData.get(C_INT, 0);
        var handler = (HookCheckMarshaller) signalRegistry.get(hash);
        handler.onHookCheckMarshaller(new Hook(References.get(hook, false)));
    }
    
    public static void cbSourceDummyMarshal() {
        int hash = .get(C_INT, 0);
        var handler = (SourceDummyMarshal) signalRegistry.get(hash);
        handler.onSourceDummyMarshal();
    }
    
    public static void cbNodeTraverseFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NodeTraverseFunc) signalRegistry.get(hash);
        handler.onNodeTraverseFunc(new Node(References.get(node, false)));
    }
    
    public static void cbHookFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (HookFunc) signalRegistry.get(hash);
        handler.onHookFunc();
    }
    
    public static void cbTestFixtureFunc(MemoryAddress fixture, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TestFixtureFunc) signalRegistry.get(hash);
        handler.onTestFixtureFunc(fixture);
    }
    
    public static void cbEqualFunc(MemoryAddress a, MemoryAddress b) {
        int hash = b.get(C_INT, 0);
        var handler = (EqualFunc) signalRegistry.get(hash);
        handler.onEqualFunc(a);
    }
    
    public static void cbCopyFunc(MemoryAddress src, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (CopyFunc) signalRegistry.get(hash);
        handler.onCopyFunc(src);
    }
    
    public static void cbScannerMsgFunc(MemoryAddress scanner, MemoryAddress message, boolean error) {
        int hash = error.get(C_INT, 0);
        var handler = (ScannerMsgFunc) signalRegistry.get(hash);
        handler.onScannerMsgFunc(new Scanner(References.get(scanner, false)), message.getUtf8String(0));
    }
    
    public static void cbHookFindFunc(MemoryAddress hook, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (HookFindFunc) signalRegistry.get(hash);
        handler.onHookFindFunc(new Hook(References.get(hook, false)));
    }
    
    public static void cbErrorClearFunc(MemoryAddress error) {
        int hash = error.get(C_INT, 0);
        var handler = (ErrorClearFunc) signalRegistry.get(hash);
        handler.onErrorClearFunc();
    }
    
    public static void cbRegexEvalCallback(MemoryAddress matchInfo, MemoryAddress result, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (RegexEvalCallback) signalRegistry.get(hash);
        handler.onRegexEvalCallback(new MatchInfo(References.get(matchInfo, false)), new String(References.get(result, false)));
    }
    
    public static void cbUnixFDSourceFunc(int fd, int condition, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (UnixFDSourceFunc) signalRegistry.get(hash);
        handler.onUnixFDSourceFunc(fd, condition);
    }
    
    public static void cbSpawnChildSetupFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SpawnChildSetupFunc) signalRegistry.get(hash);
        handler.onSpawnChildSetupFunc();
    }
    
    public static void cbDestroyNotify(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DestroyNotify) signalRegistry.get(hash);
        handler.onDestroyNotify();
    }
    
    public static void cbChildWatchFunc(MemoryAddress pid, int waitStatus, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (ChildWatchFunc) signalRegistry.get(hash);
        handler.onChildWatchFunc(Pid.fromValue(pid), waitStatus);
    }
    
    public static void cbTestDataFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TestDataFunc) signalRegistry.get(hash);
        handler.onTestDataFunc();
    }
    
    public static void cbCompareDataFunc(MemoryAddress a, MemoryAddress b, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (CompareDataFunc) signalRegistry.get(hash);
        handler.onCompareDataFunc(a, b);
    }
    
    public static void cbPrintFunc(MemoryAddress string) {
        int hash = string.get(C_INT, 0);
        var handler = (PrintFunc) signalRegistry.get(hash);
        handler.onPrintFunc();
    }
    
    public static void cbHookFinalizeFunc(MemoryAddress hookList, MemoryAddress hook) {
        int hash = hook.get(C_INT, 0);
        var handler = (HookFinalizeFunc) signalRegistry.get(hash);
        handler.onHookFinalizeFunc(new HookList(References.get(hookList, false)));
    }
    
    public static void cbTraverseFunc(MemoryAddress key, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TraverseFunc) signalRegistry.get(hash);
        handler.onTraverseFunc(key, value);
    }
    
    public static void cbFunc(MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (Func) signalRegistry.get(hash);
        handler.onFunc(data);
    }
    
    public static void cbVoidFunc() {
        int hash = .get(C_INT, 0);
        var handler = (VoidFunc) signalRegistry.get(hash);
        handler.onVoidFunc();
    }
    
    public static void cbLogWriterFunc(int logLevel, MemoryAddress fields, long nFields, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (LogWriterFunc) signalRegistry.get(hash);
        handler.onLogWriterFunc(logLevel, null, nFields);
    }
    
    public static void cbSequenceIterCompareFunc(MemoryAddress a, MemoryAddress b, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (SequenceIterCompareFunc) signalRegistry.get(hash);
        handler.onSequenceIterCompareFunc(new SequenceIter(References.get(a, false)), new SequenceIter(References.get(b, false)));
    }
    
    public static void cbHookMarshaller(MemoryAddress hook, MemoryAddress marshalData) {
        int hash = marshalData.get(C_INT, 0);
        var handler = (HookMarshaller) signalRegistry.get(hash);
        handler.onHookMarshaller(new Hook(References.get(hook, false)));
    }
    
    public static void cbOptionParseFunc(MemoryAddress context, MemoryAddress group, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (OptionParseFunc) signalRegistry.get(hash);
        handler.onOptionParseFunc(new OptionContext(References.get(context, false)), new OptionGroup(References.get(group, false)));
    }
    
    public static void cbOptionArgFunc(MemoryAddress optionName, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (OptionArgFunc) signalRegistry.get(hash);
        handler.onOptionArgFunc(optionName.getUtf8String(0), value.getUtf8String(0));
    }
    
    public static void cbTestLogFatalFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (TestLogFatalFunc) signalRegistry.get(hash);
        handler.onTestLogFatalFunc(logDomain.getUtf8String(0), logLevel, message.getUtf8String(0));
    }
    
    public static void cbSourceFunc(MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (SourceFunc) signalRegistry.get(hash);
        handler.onSourceFunc();
    }
    
    public static void cbOptionErrorFunc(MemoryAddress context, MemoryAddress group, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (OptionErrorFunc) signalRegistry.get(hash);
        handler.onOptionErrorFunc(new OptionContext(References.get(context, false)), new OptionGroup(References.get(group, false)));
    }
    
    public static void cbTraverseNodeFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TraverseNodeFunc) signalRegistry.get(hash);
        handler.onTraverseNodeFunc(new TreeNode(References.get(node, false)));
    }
    
    public static void cbHFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (HFunc) signalRegistry.get(hash);
        handler.onHFunc(key, value);
    }
    
    public static void cbDuplicateFunc(MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DuplicateFunc) signalRegistry.get(hash);
        handler.onDuplicateFunc(data);
    }
    
    public static void cbSourceDisposeFunc(MemoryAddress source) {
        int hash = source.get(C_INT, 0);
        var handler = (SourceDisposeFunc) signalRegistry.get(hash);
        handler.onSourceDisposeFunc();
    }
    
    public static void cbFreeFunc(MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (FreeFunc) signalRegistry.get(hash);
        handler.onFreeFunc();
    }
    
    public static void cbHRFunc(MemoryAddress key, MemoryAddress value, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (HRFunc) signalRegistry.get(hash);
        handler.onHRFunc(key, value);
    }
    
    public static void cbErrorInitFunc(MemoryAddress error) {
        int hash = error.get(C_INT, 0);
        var handler = (ErrorInitFunc) signalRegistry.get(hash);
        handler.onErrorInitFunc();
    }
    
    public static void cbLogFunc(MemoryAddress logDomain, int logLevel, MemoryAddress message, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (LogFunc) signalRegistry.get(hash);
        handler.onLogFunc(logDomain.getUtf8String(0), logLevel, message.getUtf8String(0));
    }
    
    public static void cbErrorCopyFunc(MemoryAddress srcError, MemoryAddress destError) {
        int hash = destError.get(C_INT, 0);
        var handler = (ErrorCopyFunc) signalRegistry.get(hash);
        handler.onErrorCopyFunc(new Error(References.get(srcError, false)));
    }
    
    public static void cbNodeForeachFunc(MemoryAddress node, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (NodeForeachFunc) signalRegistry.get(hash);
        handler.onNodeForeachFunc(new Node(References.get(node, false)));
    }
    
    public static void cbHookCompareFunc(MemoryAddress newHook, MemoryAddress sibling) {
        int hash = sibling.get(C_INT, 0);
        var handler = (HookCompareFunc) signalRegistry.get(hash);
        handler.onHookCompareFunc(new Hook(References.get(newHook, false)));
    }
    
    public static void cbHashFunc(MemoryAddress key) {
        int hash = key.get(C_INT, 0);
        var handler = (HashFunc) signalRegistry.get(hash);
        handler.onHashFunc();
    }
    
    public static void cbDataForeachFunc(MemoryAddress keyId, MemoryAddress data, MemoryAddress userData) {
        int hash = userData.get(C_INT, 0);
        var handler = (DataForeachFunc) signalRegistry.get(hash);
        handler.onDataForeachFunc(Quark.fromValue(keyId), data);
    }
    
    public static void cbPollFunc(MemoryAddress ufds, int nfsd, int timeout) {
        int hash = timeout.get(C_INT, 0);
        var handler = (PollFunc) signalRegistry.get(hash);
        handler.onPollFunc(new PollFD(References.get(ufds, false)), nfsd);
    }
    
    public static void cbCompareFunc(MemoryAddress a, MemoryAddress b) {
        int hash = b.get(C_INT, 0);
        var handler = (CompareFunc) signalRegistry.get(hash);
        handler.onCompareFunc(a);
    }
    
    public static void cbTestFunc() {
        int hash = .get(C_INT, 0);
        var handler = (TestFunc) signalRegistry.get(hash);
        handler.onTestFunc();
    }
    
    public static void cbTranslateFunc(MemoryAddress str, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TranslateFunc) signalRegistry.get(hash);
        handler.onTranslateFunc(str.getUtf8String(0));
    }
    
}
