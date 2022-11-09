package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkAboutDialog} offers a simple way to display information about
 * a program.
 * <p>
 * The shown information includes the programs' logo, name, copyright,
 * website and license. It is also possible to give credits to the authors,
 * documenters, translators and artists who have worked on the program.
 * <p>
 * An about dialog is typically opened when the user selects the {@code About}
 * option from the {@code Help} menu. All parts of the dialog are optional.
 * <p>
 * <img src="./doc-files/aboutdialog.png" alt="An example GtkAboutDialog">
 * <p>
 * About dialogs often contain links and email addresses. {@code GtkAboutDialog}
 * displays these as clickable links. By default, it calls {@link Gtk#showUri}
 * when a user clicks one. The behaviour can be overridden with the
 * {@code Gtk.AboutDialog::activate-link} signal.
 * <p>
 * To specify a person with an email address, use a string like
 * {@code Edgar Allan Poe <edgar@poe.com>}. To specify a website with a title,
 * use a string like {@code GTK team https://www.gtk.org}.
 * <p>
 * To make constructing a {@code GtkAboutDialog} as convenient as possible, you can
 * use the function {@link Gtk#showAboutDialog} which constructs and shows
 * a dialog and keeps it around so that it can be shown again.
 * <p>
 * Note that GTK sets a default title of {@code _("About %s")} on the dialog
 * window (where {@code %s} is replaced by the name of the application, but in
 * order to ensure proper translation of the title, applications should
 * set the title property explicitly when constructing a {@code GtkAboutDialog},
 * as shown in the following example:
 * <pre>{@code c
 * GFile *logo_file = g_file_new_for_path ("./logo.png");
 * GdkTexture *example_logo = gdk_texture_new_from_file (logo_file, NULL);
 * g_object_unref (logo_file);
 * 
 * gtk_show_about_dialog (NULL,
 *                        "program-name", "ExampleCode",
 *                        "logo", example_logo,
 *                        "title", _("About ExampleCode"),
 *                        NULL);
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkAboutDialog} has a single CSS node with the name {@code window} and style
 * class {@code .aboutdialog}.
 */
public class AboutDialog extends org.gtk.gtk.Window implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAboutDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AboutDialog proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AboutDialog(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to AboutDialog if its GType is a (or inherits from) "GtkAboutDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AboutDialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAboutDialog", a ClassCastException will be thrown.
     */
    public static AboutDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAboutDialog"))) {
            return new AboutDialog(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAboutDialog");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAboutDialog}.
     */
    public AboutDialog() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Creates a new section in the "Credits" page.
     * @param sectionName The name of the section
     * @param people The people who belong to that section
     */
    public void addCreditSection(@NotNull java.lang.String sectionName, @NotNull java.lang.String[] people) {
        java.util.Objects.requireNonNull(sectionName, "Parameter 'sectionName' must not be null");
        java.util.Objects.requireNonNull(people, "Parameter 'people' must not be null");
        try {
            DowncallHandles.gtk_about_dialog_add_credit_section.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sectionName),
                    Interop.allocateNativeArray(people, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the names of the artists which are displayed
     * in the credits page.
     * @return A
     *   {@code NULL}-terminated string array containing the artists
     */
    public @NotNull PointerString getArtists() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_artists.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns the names of the authors which are displayed
     * in the credits page.
     * @return A
     *   {@code NULL}-terminated string array containing the authors
     */
    public @NotNull PointerString getAuthors() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_authors.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns the comments string.
     * @return The comments
     */
    public @Nullable java.lang.String getComments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_comments.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the copyright string.
     * @return The copyright string
     */
    public @Nullable java.lang.String getCopyright() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_copyright.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the name of the documenters which are displayed
     * in the credits page.
     * @return A
     *   {@code NULL}-terminated string array containing the documenters
     */
    public @NotNull PointerString getDocumenters() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_documenters.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns the license information.
     * @return The license information
     */
    public @Nullable java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_license.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the license type.
     * @return a {@code Gtk.License} value
     */
    public @NotNull org.gtk.gtk.License getLicenseType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_about_dialog_get_license_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.License(RESULT);
    }
    
    /**
     * Returns the paintable displayed as logo in the about dialog.
     * @return the paintable displayed as
     *   logo or {@code NULL} if the logo is unset or has been set via
     *   {@link AboutDialog#setLogoIconName}
     */
    public @Nullable org.gtk.gdk.Paintable getLogo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_logo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the icon name displayed as logo in the about dialog.
     * @return the icon name displayed as logo,
     *   or {@code NULL} if the logo has been set via {@link AboutDialog#setLogo}
     */
    public @Nullable java.lang.String getLogoIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_logo_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the program name displayed in the about dialog.
     * @return The program name
     */
    public @Nullable java.lang.String getProgramName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_program_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the system information that is shown in the about dialog.
     * @return the system information
     */
    public @Nullable java.lang.String getSystemInformation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_system_information.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the translator credits string which is displayed
     * in the credits page.
     * @return The translator credits string
     */
    public @Nullable java.lang.String getTranslatorCredits() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_translator_credits.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the version string.
     * @return The version string
     */
    public @Nullable java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_version.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the website URL.
     * @return The website URL
     */
    public @Nullable java.lang.String getWebsite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_website.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the label used for the website link.
     * @return The label used for the website link
     */
    public @Nullable java.lang.String getWebsiteLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_website_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns whether the license text in the about dialog is
     * automatically wrapped.
     * @return {@code TRUE} if the license text is wrapped
     */
    public boolean getWrapLicense() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_about_dialog_get_wrap_license.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the names of the artists to be displayed
     * in the "Credits" page.
     * @param artists the authors of the artwork
     *   of the application
     */
    public void setArtists(@NotNull java.lang.String[] artists) {
        java.util.Objects.requireNonNull(artists, "Parameter 'artists' must not be null");
        try {
            DowncallHandles.gtk_about_dialog_set_artists.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(artists, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the names of the authors which are displayed
     * in the "Credits" page of the about dialog.
     * @param authors the authors of the application
     */
    public void setAuthors(@NotNull java.lang.String[] authors) {
        java.util.Objects.requireNonNull(authors, "Parameter 'authors' must not be null");
        try {
            DowncallHandles.gtk_about_dialog_set_authors.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(authors, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the comments string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     * @param comments a comments string
     */
    public void setComments(@Nullable java.lang.String comments) {
        try {
            DowncallHandles.gtk_about_dialog_set_comments.invokeExact(
                    handle(),
                    (Addressable) (comments == null ? MemoryAddress.NULL : Interop.allocateNativeString(comments)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the copyright string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     * @param copyright the copyright string
     */
    public void setCopyright(@Nullable java.lang.String copyright) {
        try {
            DowncallHandles.gtk_about_dialog_set_copyright.invokeExact(
                    handle(),
                    (Addressable) (copyright == null ? MemoryAddress.NULL : Interop.allocateNativeString(copyright)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the names of the documenters which are displayed
     * in the "Credits" page.
     * @param documenters the authors of the documentation
     *   of the application
     */
    public void setDocumenters(@NotNull java.lang.String[] documenters) {
        java.util.Objects.requireNonNull(documenters, "Parameter 'documenters' must not be null");
        try {
            DowncallHandles.gtk_about_dialog_set_documenters.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(documenters, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the license information to be displayed in the
     * about dialog.
     * <p>
     * If {@code license} is {@code NULL}, the license page is hidden.
     * @param license the license information
     */
    public void setLicense(@Nullable java.lang.String license) {
        try {
            DowncallHandles.gtk_about_dialog_set_license.invokeExact(
                    handle(),
                    (Addressable) (license == null ? MemoryAddress.NULL : Interop.allocateNativeString(license)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the license of the application showing the about dialog from a
     * list of known licenses.
     * <p>
     * This function overrides the license set using
     * {@link AboutDialog#setLicense}.
     * @param licenseType the type of license
     */
    public void setLicenseType(@NotNull org.gtk.gtk.License licenseType) {
        java.util.Objects.requireNonNull(licenseType, "Parameter 'licenseType' must not be null");
        try {
            DowncallHandles.gtk_about_dialog_set_license_type.invokeExact(
                    handle(),
                    licenseType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the logo in the about dialog.
     * @param logo a {@code GdkPaintable}
     */
    public void setLogo(@Nullable org.gtk.gdk.Paintable logo) {
        try {
            DowncallHandles.gtk_about_dialog_set_logo.invokeExact(
                    handle(),
                    (Addressable) (logo == null ? MemoryAddress.NULL : logo.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     * @param iconName an icon name
     */
    public void setLogoIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.gtk_about_dialog_set_logo_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name to display in the about dialog.
     * <p>
     * If {@code name} is not set, the string returned
     * by {@code g_get_application_name()} is used.
     * @param name the program name
     */
    public void setProgramName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gtk_about_dialog_set_program_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the system information to be displayed in the about
     * dialog.
     * <p>
     * If {@code system_information} is {@code NULL}, the system information
     * page is hidden.
     * <p>
     * See {@code Gtk.AboutDialog:system-information}.
     * @param systemInformation system information
     */
    public void setSystemInformation(@Nullable java.lang.String systemInformation) {
        try {
            DowncallHandles.gtk_about_dialog_set_system_information.invokeExact(
                    handle(),
                    (Addressable) (systemInformation == null ? MemoryAddress.NULL : Interop.allocateNativeString(systemInformation)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the translator credits string which is displayed in
     * the credits page.
     * <p>
     * The intended use for this string is to display the translator
     * of the language which is currently used in the user interface.
     * Using {@code gettext()}, a simple way to achieve that is to mark the
     * string for translation:
     * <pre>{@code c
     * GtkWidget *about = gtk_about_dialog_new ();
     *  gtk_about_dialog_set_translator_credits (GTK_ABOUT_DIALOG (about),
     *                                           _("translator-credits"));
     * }</pre>
     * <p>
     * It is a good idea to use the customary {@code msgid} “translator-credits”
     * for this purpose, since translators will already know the purpose of
     * that {@code msgid}, and since {@code GtkAboutDialog} will detect if “translator-credits”
     * is untranslated and omit translator credits.
     * @param translatorCredits the translator credits
     */
    public void setTranslatorCredits(@Nullable java.lang.String translatorCredits) {
        try {
            DowncallHandles.gtk_about_dialog_set_translator_credits.invokeExact(
                    handle(),
                    (Addressable) (translatorCredits == null ? MemoryAddress.NULL : Interop.allocateNativeString(translatorCredits)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the version string to display in the about dialog.
     * @param version the version string
     */
    public void setVersion(@Nullable java.lang.String version) {
        try {
            DowncallHandles.gtk_about_dialog_set_version.invokeExact(
                    handle(),
                    (Addressable) (version == null ? MemoryAddress.NULL : Interop.allocateNativeString(version)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the URL to use for the website link.
     * @param website a URL string starting with {@code http://}
     */
    public void setWebsite(@Nullable java.lang.String website) {
        try {
            DowncallHandles.gtk_about_dialog_set_website.invokeExact(
                    handle(),
                    (Addressable) (website == null ? MemoryAddress.NULL : Interop.allocateNativeString(website)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the label to be used for the website link.
     * @param websiteLabel the label used for the website link
     */
    public void setWebsiteLabel(@NotNull java.lang.String websiteLabel) {
        java.util.Objects.requireNonNull(websiteLabel, "Parameter 'websiteLabel' must not be null");
        try {
            DowncallHandles.gtk_about_dialog_set_website_label.invokeExact(
                    handle(),
                    Interop.allocateNativeString(websiteLabel));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the license text in the about dialog should be
     * automatically wrapped.
     * @param wrapLicense whether to wrap the license
     */
    public void setWrapLicense(boolean wrapLicense) {
        try {
            DowncallHandles.gtk_about_dialog_set_wrap_license.invokeExact(
                    handle(),
                    wrapLicense ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLink {
        boolean signalReceived(AboutDialog source, @NotNull java.lang.String uri);
    }
    
    /**
     * Emitted every time a URL is activated.
     * <p>
     * Applications may connect to it to override the default behaviour,
     * which is to call {@link Gtk#showUri}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AboutDialog.ActivateLink> onActivateLink(AboutDialog.ActivateLink handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AboutDialog.Callbacks.class, "signalAboutDialogActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AboutDialog.ActivateLink>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_about_dialog_new = Interop.downcallHandle(
            "gtk_about_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_add_credit_section = Interop.downcallHandle(
            "gtk_about_dialog_add_credit_section",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_artists = Interop.downcallHandle(
            "gtk_about_dialog_get_artists",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_authors = Interop.downcallHandle(
            "gtk_about_dialog_get_authors",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_comments = Interop.downcallHandle(
            "gtk_about_dialog_get_comments",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_copyright = Interop.downcallHandle(
            "gtk_about_dialog_get_copyright",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_documenters = Interop.downcallHandle(
            "gtk_about_dialog_get_documenters",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_license = Interop.downcallHandle(
            "gtk_about_dialog_get_license",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_license_type = Interop.downcallHandle(
            "gtk_about_dialog_get_license_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_logo = Interop.downcallHandle(
            "gtk_about_dialog_get_logo",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_logo_icon_name = Interop.downcallHandle(
            "gtk_about_dialog_get_logo_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_program_name = Interop.downcallHandle(
            "gtk_about_dialog_get_program_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_system_information = Interop.downcallHandle(
            "gtk_about_dialog_get_system_information",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_translator_credits = Interop.downcallHandle(
            "gtk_about_dialog_get_translator_credits",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_version = Interop.downcallHandle(
            "gtk_about_dialog_get_version",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_website = Interop.downcallHandle(
            "gtk_about_dialog_get_website",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_website_label = Interop.downcallHandle(
            "gtk_about_dialog_get_website_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_get_wrap_license = Interop.downcallHandle(
            "gtk_about_dialog_get_wrap_license",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_artists = Interop.downcallHandle(
            "gtk_about_dialog_set_artists",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_authors = Interop.downcallHandle(
            "gtk_about_dialog_set_authors",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_comments = Interop.downcallHandle(
            "gtk_about_dialog_set_comments",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_copyright = Interop.downcallHandle(
            "gtk_about_dialog_set_copyright",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_documenters = Interop.downcallHandle(
            "gtk_about_dialog_set_documenters",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_license = Interop.downcallHandle(
            "gtk_about_dialog_set_license",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_license_type = Interop.downcallHandle(
            "gtk_about_dialog_set_license_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_logo = Interop.downcallHandle(
            "gtk_about_dialog_set_logo",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_logo_icon_name = Interop.downcallHandle(
            "gtk_about_dialog_set_logo_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_program_name = Interop.downcallHandle(
            "gtk_about_dialog_set_program_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_system_information = Interop.downcallHandle(
            "gtk_about_dialog_set_system_information",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_translator_credits = Interop.downcallHandle(
            "gtk_about_dialog_set_translator_credits",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_version = Interop.downcallHandle(
            "gtk_about_dialog_set_version",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_website = Interop.downcallHandle(
            "gtk_about_dialog_set_website",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_website_label = Interop.downcallHandle(
            "gtk_about_dialog_set_website_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_about_dialog_set_wrap_license = Interop.downcallHandle(
            "gtk_about_dialog_set_wrap_license",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalAboutDialogActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AboutDialog.ActivateLink) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new AboutDialog(source, Ownership.UNKNOWN), Interop.getStringFrom(uri));
        }
    }
}
