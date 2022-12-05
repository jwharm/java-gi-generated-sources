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
public class OptionContext extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOptionContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OptionContext}
     * @return A new, uninitialized @{link OptionContext}
     */
    public static OptionContext allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OptionContext newInstance = new OptionContext(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a OptionContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OptionContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Adds a {@link OptionGroup} to the {@code context}, so that parsing with {@code context}
     * will recognize the options in the group. Note that this will take
     * ownership of the {@code group} and thus the {@code group} should not be freed.
     * @param group the group to add
     */
    public void addGroup(@NotNull org.gtk.glib.OptionGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.g_option_context_add_group.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        group.yieldOwnership();
    }
    
    /**
     * A convenience function which creates a main group if it doesn't
     * exist, adds the {@code entries} to it and sets the translation domain.
     * @param entries a {@code null}-terminated array of {@code GOptionEntrys}
     * @param translationDomain a translation domain to use for translating
     *    the {@code --help} output for the options in {@code entries}
     *    with gettext(), or {@code null}
     */
    public void addMainEntries(@NotNull org.gtk.glib.OptionEntry[] entries, @Nullable java.lang.String translationDomain) {
        java.util.Objects.requireNonNull(entries, "Parameter 'entries' must not be null");
        try {
            DowncallHandles.g_option_context_add_main_entries.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(entries, org.gtk.glib.OptionEntry.getMemoryLayout(), false),
                    (Addressable) (translationDomain == null ? MemoryAddress.NULL : Interop.allocateNativeString(translationDomain)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees context and all the groups which have been
     * added to it.
     * <p>
     * Please note that parsed arguments need to be freed separately (see
     * {@link OptionEntry}).
     */
    public void free() {
        try {
            DowncallHandles.g_option_context_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the description. See g_option_context_set_description().
     * @return the description
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_context_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns a formatted, translated help text for the given context.
     * To obtain the text produced by {@code --help}, call
     * {@code g_option_context_get_help (context, TRUE, NULL)}.
     * To obtain the text produced by {@code --help-all}, call
     * {@code g_option_context_get_help (context, FALSE, NULL)}.
     * To obtain the help text for an option group, call
     * {@code g_option_context_get_help (context, FALSE, group)}.
     * @param mainHelp if {@code true}, only include the main group
     * @param group the {@link OptionGroup} to create help for, or {@code null}
     * @return A newly allocated string containing the help text
     */
    public @NotNull java.lang.String getHelp(boolean mainHelp, @Nullable org.gtk.glib.OptionGroup group) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_context_get_help.invokeExact(
                    handle(),
                    mainHelp ? 1 : 0,
                    (Addressable) (group == null ? MemoryAddress.NULL : group.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether automatic {@code --help} generation
     * is turned on for {@code context}. See g_option_context_set_help_enabled().
     * @return {@code true} if automatic help generation is turned on.
     */
    public boolean getHelpEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_option_context_get_help_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether unknown options are ignored or not. See
     * g_option_context_set_ignore_unknown_options().
     * @return {@code true} if unknown options are ignored.
     */
    public boolean getIgnoreUnknownOptions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_option_context_get_ignore_unknown_options.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns a pointer to the main group of {@code context}.
     * @return the main group of {@code context}, or {@code null} if
     *  {@code context} doesn't have a main group. Note that group belongs to
     *  {@code context} and should not be modified or freed.
     */
    public @NotNull org.gtk.glib.OptionGroup getMainGroup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_context_get_main_group.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.OptionGroup(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether strict POSIX code is enabled.
     * <p>
     * See g_option_context_set_strict_posix() for more information.
     * @return {@code true} if strict POSIX is enabled, {@code false} otherwise.
     */
    public boolean getStrictPosix() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_option_context_get_strict_posix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the summary. See g_option_context_set_summary().
     * @return the summary
     */
    public @NotNull java.lang.String getSummary() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_context_get_summary.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param argc a pointer to the number of command line arguments
     * @param argv a pointer to the array of command line arguments
     * @return {@code true} if the parsing was successful,
     *               {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean parse(Out<Integer> argc, @NotNull Out<java.lang.String[]> argv) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(argc, "Parameter 'argc' must not be null");
        MemorySegment argcPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(argv, "Parameter 'argv' must not be null");
        MemorySegment argvPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_option_context_parse.invokeExact(
                    handle(),
                    (Addressable) argcPOINTER.address(),
                    (Addressable) argvPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        argc.set(argcPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] argvARRAY = new java.lang.String[argc.get().intValue()];
        for (int I = 0; I < argc.get().intValue(); I++) {
            var OBJ = argvPOINTER.get(Interop.valueLayout.ADDRESS, I);
            argvARRAY[I] = Interop.getStringFrom(OBJ);
        }
        argv.set(argvARRAY);
        return RESULT != 0;
    }
    
    /**
     * Parses the command line arguments.
     * <p>
     * This function is similar to g_option_context_parse() except that it
     * respects the normal memory rules when dealing with a strv instead of
     * assuming that the passed-in array is the argv of the main function.
     * <p>
     * In particular, strings that are removed from the arguments list will
     * be freed using g_free().
     * <p>
     * On Windows, the strings are expected to be in UTF-8.  This is in
     * contrast to g_option_context_parse() which expects them to be in the
     * system codepage, which is how they are passed as {@code argv} to main().
     * See g_win32_get_command_line() for a solution.
     * <p>
     * This function is useful if you are trying to use {@link OptionContext} with
     * {@link org.gtk.gio.Application}.
     * @param arguments a pointer
     *    to the command line arguments (which must be in UTF-8 on Windows).
     *    Starting with GLib 2.62, {@code arguments} can be {@code null}, which matches
     *    g_option_context_parse().
     * @return {@code true} if the parsing was successful,
     *          {@code false} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean parseStrv(@NotNull Out<java.lang.String[]> arguments) throws io.github.jwharm.javagi.GErrorException {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Adds a string to be displayed in {@code --help} output after the list
     * of options. This text often includes a bug reporting address.
     * <p>
     * Note that the summary is translated (see
     * g_option_context_set_translate_func()).
     * @param description a string to be shown in {@code --help} output
     *   after the list of options, or {@code null}
     */
    public void setDescription(@Nullable java.lang.String description) {
        try {
            DowncallHandles.g_option_context_set_description.invokeExact(
                    handle(),
                    (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables or disables automatic generation of {@code --help} output.
     * By default, g_option_context_parse() recognizes {@code --help}, {@code -h},
     * {@code -?}, {@code --help-all} and {@code --help-groupname} and creates suitable
     * output to stdout.
     * @param helpEnabled {@code true} to enable {@code --help}, {@code false} to disable it
     */
    public void setHelpEnabled(boolean helpEnabled) {
        try {
            DowncallHandles.g_option_context_set_help_enabled.invokeExact(
                    handle(),
                    helpEnabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to ignore unknown options or not. If an argument is
     * ignored, it is left in the {@code argv} array after parsing. By default,
     * g_option_context_parse() treats unknown options as error.
     * <p>
     * This setting does not affect non-option arguments (i.e. arguments
     * which don't start with a dash). But note that GOption cannot reliably
     * determine whether a non-option belongs to a preceding unknown option.
     * @param ignoreUnknown {@code true} to ignore unknown options, {@code false} to produce
     *    an error when unknown options are met
     */
    public void setIgnoreUnknownOptions(boolean ignoreUnknown) {
        try {
            DowncallHandles.g_option_context_set_ignore_unknown_options.invokeExact(
                    handle(),
                    ignoreUnknown ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@link OptionGroup} as main group of the {@code context}.
     * This has the same effect as calling g_option_context_add_group(),
     * the only difference is that the options in the main group are
     * treated differently when generating {@code --help} output.
     * @param group the group to set as main group
     */
    public void setMainGroup(@NotNull org.gtk.glib.OptionGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.g_option_context_set_main_group.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        group.yieldOwnership();
    }
    
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
     * @param strictPosix the new value
     */
    public void setStrictPosix(boolean strictPosix) {
        try {
            DowncallHandles.g_option_context_set_strict_posix.invokeExact(
                    handle(),
                    strictPosix ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a string to be displayed in {@code --help} output before the list
     * of options. This is typically a summary of the program functionality.
     * <p>
     * Note that the summary is translated (see
     * g_option_context_set_translate_func() and
     * g_option_context_set_translation_domain()).
     * @param summary a string to be shown in {@code --help} output
     *  before the list of options, or {@code null}
     */
    public void setSummary(@Nullable java.lang.String summary) {
        try {
            DowncallHandles.g_option_context_set_summary.invokeExact(
                    handle(),
                    (Addressable) (summary == null ? MemoryAddress.NULL : Interop.allocateNativeString(summary)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param func the {@link TranslateFunc}, or {@code null}
     */
    public void setTranslateFunc(@Nullable org.gtk.glib.TranslateFunc func) {
        try {
            DowncallHandles.g_option_context_set_translate_func.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbTranslateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     * @param domain the domain to use
     */
    public void setTranslationDomain(@NotNull java.lang.String domain) {
        java.util.Objects.requireNonNull(domain, "Parameter 'domain' must not be null");
        try {
            DowncallHandles.g_option_context_set_translation_domain.invokeExact(
                    handle(),
                    Interop.allocateNativeString(domain));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param parameterString a string which is displayed in
     *    the first line of {@code --help} output, after the usage summary
     *    {@code programname [OPTION...]}
     * @return a newly created {@link OptionContext}, which must be
     *    freed with g_option_context_free() after use.
     */
    public static @NotNull org.gtk.glib.OptionContext new_(@Nullable java.lang.String parameterString) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_option_context_new.invokeExact(
                    (Addressable) (parameterString == null ? MemoryAddress.NULL : Interop.allocateNativeString(parameterString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.OptionContext(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_option_context_add_group = Interop.downcallHandle(
            "g_option_context_add_group",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_add_main_entries = Interop.downcallHandle(
            "g_option_context_add_main_entries",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_free = Interop.downcallHandle(
            "g_option_context_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_description = Interop.downcallHandle(
            "g_option_context_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_help = Interop.downcallHandle(
            "g_option_context_get_help",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_help_enabled = Interop.downcallHandle(
            "g_option_context_get_help_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_ignore_unknown_options = Interop.downcallHandle(
            "g_option_context_get_ignore_unknown_options",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_main_group = Interop.downcallHandle(
            "g_option_context_get_main_group",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_strict_posix = Interop.downcallHandle(
            "g_option_context_get_strict_posix",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_get_summary = Interop.downcallHandle(
            "g_option_context_get_summary",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_parse = Interop.downcallHandle(
            "g_option_context_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_parse_strv = Interop.downcallHandle(
            "g_option_context_parse_strv",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_set_description = Interop.downcallHandle(
            "g_option_context_set_description",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_set_help_enabled = Interop.downcallHandle(
            "g_option_context_set_help_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_option_context_set_ignore_unknown_options = Interop.downcallHandle(
            "g_option_context_set_ignore_unknown_options",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_option_context_set_main_group = Interop.downcallHandle(
            "g_option_context_set_main_group",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_set_strict_posix = Interop.downcallHandle(
            "g_option_context_set_strict_posix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_option_context_set_summary = Interop.downcallHandle(
            "g_option_context_set_summary",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_set_translate_func = Interop.downcallHandle(
            "g_option_context_set_translate_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_set_translation_domain = Interop.downcallHandle(
            "g_option_context_set_translation_domain",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_option_context_new = Interop.downcallHandle(
            "g_option_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
