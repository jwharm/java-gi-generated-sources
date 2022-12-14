package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A helper class for testing code which uses D-Bus without touching the user's
 * session bus.
 * <p>
 * Note that {@link TestDBus} modifies the user’s environment, calling setenv().
 * This is not thread-safe, so all {@link TestDBus} calls should be completed before
 * threads are spawned, or should have appropriate locking to ensure no access
 * conflicts to environment variables shared between {@link TestDBus} and other
 * threads.
 * <p>
 * <strong>Creating unit tests using GTestDBus</strong><br/>
 * Testing of D-Bus services can be tricky because normally we only ever run
 * D-Bus services over an existing instance of the D-Bus daemon thus we
 * usually don't activate D-Bus services that are not yet installed into the
 * target system. The {@link TestDBus} object makes this easier for us by taking care
 * of the lower level tasks such as running a private D-Bus daemon and looking
 * up uninstalled services in customizable locations, typically in your source
 * code tree.
 * <p>
 * The first thing you will need is a separate service description file for the
 * D-Bus daemon. Typically a {@code services} subdirectory of your {@code tests} directory
 * is a good place to put this file.
 * <p>
 * The service file should list your service along with an absolute path to the
 * uninstalled service executable in your source tree. Using autotools we would
 * achieve this by adding a file such as {@code my-server.service.in} in the services
 * directory and have it processed by configure.
 * <pre>{@code 
 *     [D-BUS Service]
 *     Name=org.gtk.GDBus.Examples.ObjectManager
 *     Exec=@abs_top_builddir@/gio/tests/gdbus-example-objectmanager-server
 * }</pre>
 * You will also need to indicate this service directory in your test
 * fixtures, so you will need to pass the path while compiling your
 * test cases. Typically this is done with autotools with an added
 * preprocessor flag specified to compile your tests such as:
 * <pre>{@code 
 *     -DTEST_SERVICES=\\""$(abs_top_builddir)/tests/services"\\"
 * }</pre>
 *     Once you have a service definition file which is local to your source tree,
 * you can proceed to set up a GTest fixture using the {@link TestDBus} scaffolding.
 * <p>
 * An example of a test fixture for D-Bus services can be found
 * here:
 * <a href="https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-test-fixture.c">gdbus-test-fixture.c</a>
 * <p>
 * Note that these examples only deal with isolating the D-Bus aspect of your
 * service. To successfully run isolated unit tests on your service you may need
 * some additional modifications to your test case fixture. For example; if your
 * service uses GSettings and installs a schema then it is important that your test service
 * not load the schema in the ordinary installed location (chances are that your service
 * and schema files are not yet installed, or worse; there is an older version of the
 * schema file sitting in the install location).
 * <p>
 * Most of the time we can work around these obstacles using the
 * environment. Since the environment is inherited by the D-Bus daemon
 * created by {@link TestDBus} and then in turn inherited by any services the
 * D-Bus daemon activates, using the setup routine for your fixture is
 * a practical place to help sandbox your runtime environment. For the
 * rather typical GSettings case we can work around this by setting
 * {@code GSETTINGS_SCHEMA_DIR} to the in tree directory holding your schemas
 * in the above fixture_setup() routine.
 * <p>
 * The GSettings schemas need to be locally pre-compiled for this to work. This can be achieved
 * by compiling the schemas locally as a step before running test cases, an autotools setup might
 * do the following in the directory holding schemas:
 * <pre>{@code 
 *     all-am:
 *             $(GLIB_COMPILE_SCHEMAS) .
 * 
 *     CLEANFILES += gschemas.compiled
 * }</pre>
 * @version 2.34
 */
public class TestDBus extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestDBus";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TestDBus proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TestDBus(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestDBus> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TestDBus(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.TestDBusFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_dbus_new.invokeExact(flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link TestDBus} object.
     * @param flags a {@link TestDBusFlags}
     */
    public TestDBus(org.gtk.gio.TestDBusFlags flags) {
        super(constructNew(flags));
        this.takeOwnership();
    }
    
    /**
     * Add a path where dbus-daemon will look up .service files. This can't be
     * called after g_test_dbus_up().
     * @param path path to a directory containing .service files
     */
    public void addServiceDir(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_test_dbus_add_service_dir.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Stop the session bus started by g_test_dbus_up().
     * <p>
     * This will wait for the singleton returned by g_bus_get() or g_bus_get_sync()
     * to be destroyed. This is done to ensure that the next unit test won't get a
     * leaked singleton from this test.
     */
    public void down() {
        try {
            DowncallHandles.g_test_dbus_down.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the address on which dbus-daemon is running. If g_test_dbus_up() has not
     * been called yet, {@code null} is returned. This can be used with
     * g_dbus_connection_new_for_address().
     * @return the address of the bus, or {@code null}.
     */
    public @Nullable java.lang.String getBusAddress() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_dbus_get_bus_address.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the flags of the {@link TestDBus} object.
     * @return the value of {@link TestDBus}:flags property
     */
    public org.gtk.gio.TestDBusFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_test_dbus_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TestDBusFlags(RESULT);
    }
    
    /**
     * Stop the session bus started by g_test_dbus_up().
     * <p>
     * Unlike g_test_dbus_down(), this won't verify the {@link DBusConnection}
     * singleton returned by g_bus_get() or g_bus_get_sync() is destroyed. Unit
     * tests wanting to verify behaviour after the session bus has been stopped
     * can use this function but should still call g_test_dbus_down() when done.
     */
    public void stop() {
        try {
            DowncallHandles.g_test_dbus_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Start a dbus-daemon instance and set DBUS_SESSION_BUS_ADDRESS. After this
     * call, it is safe for unit tests to start sending messages on the session bus.
     * <p>
     * If this function is called from setup callback of g_test_add(),
     * g_test_dbus_down() must be called in its teardown callback.
     * <p>
     * If this function is called from unit test's main(), then g_test_dbus_down()
     * must be called after g_test_run().
     */
    public void up() {
        try {
            DowncallHandles.g_test_dbus_up.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_test_dbus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Unset DISPLAY and DBUS_SESSION_BUS_ADDRESS env variables to ensure the test
     * won't use user's session bus.
     * <p>
     * This is useful for unit tests that want to verify behaviour when no session
     * bus is running. It is not necessary to call this if unit test already calls
     * g_test_dbus_up() before acquiring the session bus.
     */
    public static void unset() {
        try {
            DowncallHandles.g_test_dbus_unset.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TestDBus.Builder} object constructs a {@link TestDBus} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TestDBus.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TestDBus} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TestDBus}.
         * @return A new instance of {@code TestDBus} with the properties 
         *         that were set in the Builder object.
         */
        public TestDBus build() {
            return (TestDBus) org.gtk.gobject.GObject.newWithProperties(
                TestDBus.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@link TestDBusFlags} specifying the behaviour of the D-Bus session.
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gio.TestDBusFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_dbus_new = Interop.downcallHandle(
                "g_test_dbus_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_test_dbus_add_service_dir = Interop.downcallHandle(
                "g_test_dbus_add_service_dir",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_dbus_down = Interop.downcallHandle(
                "g_test_dbus_down",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_dbus_get_bus_address = Interop.downcallHandle(
                "g_test_dbus_get_bus_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_dbus_get_flags = Interop.downcallHandle(
                "g_test_dbus_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_dbus_stop = Interop.downcallHandle(
                "g_test_dbus_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_dbus_up = Interop.downcallHandle(
                "g_test_dbus_up",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_dbus_get_type = Interop.downcallHandle(
                "g_test_dbus_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_test_dbus_unset = Interop.downcallHandle(
                "g_test_dbus_unset",
                FunctionDescriptor.ofVoid(),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_test_dbus_get_type != null;
    }
}
