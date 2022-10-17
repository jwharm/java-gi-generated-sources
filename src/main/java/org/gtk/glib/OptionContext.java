package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GOptionContext} struct defines which options
 * are accepted by the commandline option parser. The struct has only private
 * fields and should not be directly accessed.
 */
public class OptionContext extends io.github.jwharm.javagi.ResourceBase {

    public OptionContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_option_context_add_group = Interop.downcallHandle(
        "g_option_context_add_group",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a {@link OptionGroup} to the {@code context}, so that parsing with {@code context}
     * will recognize the options in the group. Note that this will take
     * ownership of the {@code group} and thus the {@code group} should not be freed.
     */
    public @NotNull void addGroup(@NotNull OptionGroup group) {
        try {
            g_option_context_add_group.invokeExact(handle(), group.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_add_main_entries = Interop.downcallHandle(
        "g_option_context_add_main_entries",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function which creates a main group if it doesn't
     * exist, adds the {@code entries} to it and sets the translation domain.
     */
    public @NotNull void addMainEntries(@NotNull OptionEntry[] entries, @Nullable java.lang.String translationDomain) {
        try {
            g_option_context_add_main_entries.invokeExact(handle(), Interop.allocateNativeArray(entries), Interop.allocateNativeString(translationDomain));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_free = Interop.downcallHandle(
        "g_option_context_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees context and all the groups which have been
     * added to it.
     * <p>
     * Please note that parsed arguments need to be freed separately (see
     * {@link OptionEntry}).
     */
    public @NotNull void free() {
        try {
            g_option_context_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_get_description = Interop.downcallHandle(
        "g_option_context_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the description. See g_option_context_set_description().
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_option_context_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_option_context_get_help = Interop.downcallHandle(
        "g_option_context_get_help",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a formatted, translated help text for the given context.
     * To obtain the text produced by {@code --help}, call
     * {@code g_option_context_get_help (context, TRUE, NULL)}.
     * To obtain the text produced by {@code --help-all}, call
     * {@code g_option_context_get_help (context, FALSE, NULL)}.
     * To obtain the help text for an option group, call
     * {@code g_option_context_get_help (context, FALSE, group)}.
     */
    public @NotNull java.lang.String getHelp(@NotNull boolean mainHelp, @Nullable OptionGroup group) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_option_context_get_help.invokeExact(handle(), mainHelp ? 1 : 0, group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_option_context_get_help_enabled = Interop.downcallHandle(
        "g_option_context_get_help_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether automatic {@code --help} generation
     * is turned on for {@code context}. See g_option_context_set_help_enabled().
     */
    public boolean getHelpEnabled() {
        int RESULT;
        try {
            RESULT = (int) g_option_context_get_help_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_option_context_get_ignore_unknown_options = Interop.downcallHandle(
        "g_option_context_get_ignore_unknown_options",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether unknown options are ignored or not. See
     * g_option_context_set_ignore_unknown_options().
     */
    public boolean getIgnoreUnknownOptions() {
        int RESULT;
        try {
            RESULT = (int) g_option_context_get_ignore_unknown_options.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_option_context_get_main_group = Interop.downcallHandle(
        "g_option_context_get_main_group",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a pointer to the main group of {@code context}.
     */
    public @NotNull OptionGroup getMainGroup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_option_context_get_main_group.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OptionGroup(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_option_context_get_strict_posix = Interop.downcallHandle(
        "g_option_context_get_strict_posix",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether strict POSIX code is enabled.
     * <p>
     * See g_option_context_set_strict_posix() for more information.
     */
    public boolean getStrictPosix() {
        int RESULT;
        try {
            RESULT = (int) g_option_context_get_strict_posix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_option_context_get_summary = Interop.downcallHandle(
        "g_option_context_get_summary",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the summary. See g_option_context_set_summary().
     */
    public @NotNull java.lang.String getSummary() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_option_context_get_summary.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_option_context_parse = Interop.downcallHandle(
        "g_option_context_parse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses the command line arguments, recognizing options
     * which have been added to {@code context}. A side-effect of
     * calling this function is that g_set_prgname() will be
     * called.
     * <p>
     * If the parsing is successful, any parsed arguments are
     * removed from the array and {@code argc} and {@code argv} are updated
     * accordingly. A '--' option is stripped from {@code argv}
     * unless there are unparsed options before and after it,
     * or some of the options after it start with '-'. In case
     * of an error, {@code argc} and {@code argv} are left unmodified.
     * <p>
     * If automatic {@code --help} support is enabled
     * (see g_option_context_set_help_enabled()), and the
     * {@code argv} array contains one of the recognized help options,
     * this function will produce help output to stdout and
     * call {@code exit (0)}.
     * <p>
     * Note that function depends on the [current locale][setlocale] for
     * automatic character set conversion of string and filename
     * arguments.
     */
    public boolean parse(@NotNull Out<Integer> argc, @NotNull Out<java.lang.String[]> argv) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment argcPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment argvPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_option_context_parse.invokeExact(handle(), (Addressable) argcPOINTER.address(), (Addressable) argvPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        argc.set(argcPOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] argvARRAY = new java.lang.String[argc.get().intValue()];
        for (int I = 0; I < argc.get().intValue(); I++) {
            var OBJ = argvPOINTER.get(ValueLayout.ADDRESS, I);
            argvARRAY[I] = OBJ.getUtf8String(0);
        }
        argv.set(argvARRAY);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_option_context_set_description = Interop.downcallHandle(
        "g_option_context_set_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a string to be displayed in {@code --help} output after the list
     * of options. This text often includes a bug reporting address.
     * <p>
     * Note that the summary is translated (see
     * g_option_context_set_translate_func()).
     */
    public @NotNull void setDescription(@Nullable java.lang.String description) {
        try {
            g_option_context_set_description.invokeExact(handle(), Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_help_enabled = Interop.downcallHandle(
        "g_option_context_set_help_enabled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Enables or disables automatic generation of {@code --help} output.
     * By default, g_option_context_parse() recognizes {@code --help}, {@code -h},
     * {@code -?}, {@code --help-all} and {@code --help-groupname} and creates suitable
     * output to stdout.
     */
    public @NotNull void setHelpEnabled(@NotNull boolean helpEnabled) {
        try {
            g_option_context_set_help_enabled.invokeExact(handle(), helpEnabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_ignore_unknown_options = Interop.downcallHandle(
        "g_option_context_set_ignore_unknown_options",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to ignore unknown options or not. If an argument is
     * ignored, it is left in the {@code argv} array after parsing. By default,
     * g_option_context_parse() treats unknown options as error.
     * <p>
     * This setting does not affect non-option arguments (i.e. arguments
     * which don't start with a dash). But note that GOption cannot reliably
     * determine whether a non-option belongs to a preceding unknown option.
     */
    public @NotNull void setIgnoreUnknownOptions(@NotNull boolean ignoreUnknown) {
        try {
            g_option_context_set_ignore_unknown_options.invokeExact(handle(), ignoreUnknown ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_main_group = Interop.downcallHandle(
        "g_option_context_set_main_group",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@link OptionGroup} as main group of the {@code context}.
     * This has the same effect as calling g_option_context_add_group(),
     * the only difference is that the options in the main group are
     * treated differently when generating {@code --help} output.
     */
    public @NotNull void setMainGroup(@NotNull OptionGroup group) {
        try {
            g_option_context_set_main_group.invokeExact(handle(), group.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_strict_posix = Interop.downcallHandle(
        "g_option_context_set_strict_posix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets strict POSIX mode.
     * <p>
     * By default, this mode is disabled.
     * <p>
     * In strict POSIX mode, the first non-argument parameter encountered
     * (eg: filename) terminates argument processing.  Remaining arguments
     * are treated as non-options and are not attempted to be parsed.
     * <p>
     * If strict POSIX mode is disabled then parsing is done in the GNU way
     * where option arguments can be freely mixed with non-options.
     * <p>
     * As an example, consider "ls foo -l".  With GNU style parsing, this
     * will list "foo" in long mode.  In strict POSIX style, this will list
     * the files named "foo" and "-l".
     * <p>
     * It may be useful to force strict POSIX mode when creating "verb
     * style" command line tools.  For example, the "gsettings" command line
     * tool supports the global option "--schemadir" as well as many
     * subcommands ("get", "set", etc.) which each have their own set of
     * arguments.  Using strict POSIX mode will allow parsing the global
     * options up to the verb name while leaving the remaining options to be
     * parsed by the relevant subcommand (which can be determined by
     * examining the verb name, which should be present in argv[1] after
     * parsing).
     */
    public @NotNull void setStrictPosix(@NotNull boolean strictPosix) {
        try {
            g_option_context_set_strict_posix.invokeExact(handle(), strictPosix ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_summary = Interop.downcallHandle(
        "g_option_context_set_summary",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a string to be displayed in {@code --help} output before the list
     * of options. This is typically a summary of the program functionality.
     * <p>
     * Note that the summary is translated (see
     * g_option_context_set_translate_func() and
     * g_option_context_set_translation_domain()).
     */
    public @NotNull void setSummary(@Nullable java.lang.String summary) {
        try {
            g_option_context_set_summary.invokeExact(handle(), Interop.allocateNativeString(summary));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_translate_func = Interop.downcallHandle(
        "g_option_context_set_translate_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the function which is used to translate the contexts
     * user-visible strings, for {@code --help} output. If {@code func} is {@code null},
     * strings are not translated.
     * <p>
     * Note that option groups have their own translation functions,
     * this function only affects the {@code parameter_string} (see g_option_context_new()),
     * the summary (see g_option_context_set_summary()) and the description
     * (see g_option_context_set_description()).
     * <p>
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_context_set_translation_domain().
     */
    public @NotNull void setTranslateFunc(@Nullable TranslateFunc func) {
        try {
            g_option_context_set_translate_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbTranslateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_set_translation_domain = Interop.downcallHandle(
        "g_option_context_set_translation_domain",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     */
    public @NotNull void setTranslationDomain(@NotNull java.lang.String domain) {
        try {
            g_option_context_set_translation_domain.invokeExact(handle(), Interop.allocateNativeString(domain));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_option_context_new = Interop.downcallHandle(
        "g_option_context_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new option context.
     * <p>
     * The {@code parameter_string} can serve multiple purposes. It can be used
     * to add descriptions for "rest" arguments, which are not parsed by
     * the {@link OptionContext}, typically something like "FILES" or
     * "FILE1 FILE2...". If you are using {@code G_OPTION_REMAINING} for
     * collecting "rest" arguments, GLib handles this automatically by
     * using the {@code arg_description} of the corresponding {@link OptionEntry} in
     * the usage summary.
     * <p>
     * Another usage is to give a short summary of the program
     * functionality, like " - frob the strings", which will be displayed
     * in the same line as the usage. For a longer description of the
     * program functionality that should be displayed as a paragraph
     * below the usage line, use g_option_context_set_summary().
     * <p>
     * Note that the {@code parameter_string} is translated using the
     * function set with g_option_context_set_translate_func(), so
     * it should normally be passed untranslated.
     */
    public static @NotNull OptionContext new_(@Nullable java.lang.String parameterString) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_option_context_new.invokeExact(Interop.allocateNativeString(parameterString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OptionContext(Refcounted.get(RESULT, false));
    }
    
}
