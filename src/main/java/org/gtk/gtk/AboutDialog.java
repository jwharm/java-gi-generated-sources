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
     */
    protected AboutDialog(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AboutDialog> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AboutDialog(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Creates a new section in the "Credits" page.
     * @param sectionName The name of the section
     * @param people The people who belong to that section
     */
    public void addCreditSection(java.lang.String sectionName, java.lang.String[] people) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_add_credit_section.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(sectionName, SCOPE),
                        Interop.allocateNativeArray(people, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns the names of the artists which are displayed
     * in the credits page.
     * @return A
     *   {@code NULL}-terminated string array containing the artists
     */
    public PointerString getArtists() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_artists.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Returns the names of the authors which are displayed
     * in the credits page.
     * @return A
     *   {@code NULL}-terminated string array containing the authors
     */
    public PointerString getAuthors() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_authors.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Returns the comments string.
     * @return The comments
     */
    public @Nullable java.lang.String getComments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_comments.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the copyright string.
     * @return The copyright string
     */
    public @Nullable java.lang.String getCopyright() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_copyright.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the name of the documenters which are displayed
     * in the credits page.
     * @return A
     *   {@code NULL}-terminated string array containing the documenters
     */
    public PointerString getDocumenters() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_documenters.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Returns the license information.
     * @return The license information
     */
    public @Nullable java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the license type.
     * @return a {@code Gtk.License} value
     */
    public org.gtk.gtk.License getLicenseType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_about_dialog_get_license_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.License.of(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_logo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Paintable) Interop.register(RESULT, org.gtk.gdk.Paintable.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the icon name displayed as logo in the about dialog.
     * @return the icon name displayed as logo,
     *   or {@code NULL} if the logo has been set via {@link AboutDialog#setLogo}
     */
    public @Nullable java.lang.String getLogoIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_logo_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the program name displayed in the about dialog.
     * @return The program name
     */
    public @Nullable java.lang.String getProgramName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_program_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the system information that is shown in the about dialog.
     * @return the system information
     */
    public @Nullable java.lang.String getSystemInformation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_system_information.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the translator credits string which is displayed
     * in the credits page.
     * @return The translator credits string
     */
    public @Nullable java.lang.String getTranslatorCredits() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_translator_credits.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the version string.
     * @return The version string
     */
    public @Nullable java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_version.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the website URL.
     * @return The website URL
     */
    public @Nullable java.lang.String getWebsite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_website.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the label used for the website link.
     * @return The label used for the website link
     */
    public @Nullable java.lang.String getWebsiteLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_about_dialog_get_website_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns whether the license text in the about dialog is
     * automatically wrapped.
     * @return {@code TRUE} if the license text is wrapped
     */
    public boolean getWrapLicense() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_about_dialog_get_wrap_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the names of the artists to be displayed
     * in the "Credits" page.
     * @param artists the authors of the artwork
     *   of the application
     */
    public void setArtists(java.lang.String[] artists) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_artists.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(artists, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the names of the authors which are displayed
     * in the "Credits" page of the about dialog.
     * @param authors the authors of the application
     */
    public void setAuthors(java.lang.String[] authors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_authors.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(authors, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the comments string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     * @param comments a comments string
     */
    public void setComments(@Nullable java.lang.String comments) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_comments.invokeExact(
                        handle(),
                        (Addressable) (comments == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(comments, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the copyright string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     * @param copyright the copyright string
     */
    public void setCopyright(@Nullable java.lang.String copyright) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_copyright.invokeExact(
                        handle(),
                        (Addressable) (copyright == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(copyright, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the names of the documenters which are displayed
     * in the "Credits" page.
     * @param documenters the authors of the documentation
     *   of the application
     */
    public void setDocumenters(java.lang.String[] documenters) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_documenters.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(documenters, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_license.invokeExact(
                        handle(),
                        (Addressable) (license == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(license, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void setLicenseType(org.gtk.gtk.License licenseType) {
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_logo_icon_name.invokeExact(
                        handle(),
                        (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_program_name.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_system_information.invokeExact(
                        handle(),
                        (Addressable) (systemInformation == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(systemInformation, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_translator_credits.invokeExact(
                        handle(),
                        (Addressable) (translatorCredits == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(translatorCredits, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the version string to display in the about dialog.
     * @param version the version string
     */
    public void setVersion(@Nullable java.lang.String version) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_version.invokeExact(
                        handle(),
                        (Addressable) (version == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(version, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the URL to use for the website link.
     * @param website a URL string starting with {@code http://}
     */
    public void setWebsite(@Nullable java.lang.String website) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_website.invokeExact(
                        handle(),
                        (Addressable) (website == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(website, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the label to be used for the website link.
     * @param websiteLabel the label used for the website link
     */
    public void setWebsiteLabel(java.lang.String websiteLabel) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_about_dialog_set_website_label.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(websiteLabel, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
                    Marshal.booleanToInteger.marshal(wrapLicense, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_about_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ActivateLink} callback.
     */
    @FunctionalInterface
    public interface ActivateLink {
    
        /**
         * Emitted every time a URL is activated.
         * <p>
         * Applications may connect to it to override the default behaviour,
         * which is to call {@link Gtk#showUri}.
         */
        boolean run(java.lang.String uri);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceAboutDialog, MemoryAddress uri) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(Marshal.addressToString.marshal(uri, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateLink.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-link", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AboutDialog.Builder} object constructs a {@link AboutDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AboutDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Window.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AboutDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AboutDialog}.
         * @return A new instance of {@code AboutDialog} with the properties 
         *         that were set in the Builder object.
         */
        public AboutDialog build() {
            return (AboutDialog) org.gtk.gobject.GObject.newWithProperties(
                AboutDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Comments about the program.
         * <p>
         * This string is displayed in a label in the main dialog, thus it
         * should be a short explanation of the main purpose of the program,
         * not a detailed list of features.
         * @param comments The value for the {@code comments} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setComments(java.lang.String comments) {
            names.add("comments");
            values.add(org.gtk.gobject.Value.create(comments));
            return this;
        }
        
        /**
         * Copyright information for the program.
         * @param copyright The value for the {@code copyright} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCopyright(java.lang.String copyright) {
            names.add("copyright");
            values.add(org.gtk.gobject.Value.create(copyright));
            return this;
        }
        
        /**
         * The license of the program, as free-form text.
         * <p>
         * This string is displayed in a text view in a secondary dialog, therefore
         * it is fine to use a long multi-paragraph text. Note that the text is only
         * wrapped in the text view if the "wrap-license" property is set to {@code TRUE};
         * otherwise the text itself must contain the intended linebreaks.
         * <p>
         * When setting this property to a non-{@code NULL} value, the
         * {@code Gtk.AboutDialog:license-type} property is set to
         * {@code GTK_LICENSE_CUSTOM} as a side effect.
         * <p>
         * The text may contain links in this format {@code <http://www.some.place/>}
         * and email references in the form {@code <mail-to@some.body>}, and these will
         * be converted into clickable links.
         * @param license The value for the {@code license} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLicense(java.lang.String license) {
            names.add("license");
            values.add(org.gtk.gobject.Value.create(license));
            return this;
        }
        
        /**
         * The license of the program.
         * <p>
         * The {@code GtkAboutDialog} will automatically fill out a standard disclaimer
         * and link the user to the appropriate online resource for the license
         * text.
         * <p>
         * If {@code GTK_LICENSE_UNKNOWN} is used, the link used will be the same
         * specified in the {@code Gtk.AboutDialog:website} property.
         * <p>
         * If {@code GTK_LICENSE_CUSTOM} is used, the current contents of the
         * {@code Gtk.AboutDialog:license} property are used.
         * <p>
         * For any other {@code Gtk.License} value, the contents of the
         * {@code Gtk.AboutDialog:license} property are also set by this property as
         * a side effect.
         * @param licenseType The value for the {@code license-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLicenseType(org.gtk.gtk.License licenseType) {
            names.add("license-type");
            values.add(org.gtk.gobject.Value.create(licenseType));
            return this;
        }
        
        /**
         * A logo for the about box.
         * <p>
         * If it is {@code NULL}, the default window icon set with
         * {@link Window#setDefaultIconName} will be used.
         * @param logo The value for the {@code logo} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLogo(org.gtk.gdk.Paintable logo) {
            names.add("logo");
            values.add(org.gtk.gobject.Value.create(logo));
            return this;
        }
        
        /**
         * A named icon to use as the logo for the about box.
         * <p>
         * This property overrides the {@code Gtk.AboutDialog:logo} property.
         * @param logoIconName The value for the {@code logo-icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLogoIconName(java.lang.String logoIconName) {
            names.add("logo-icon-name");
            values.add(org.gtk.gobject.Value.create(logoIconName));
            return this;
        }
        
        /**
         * The name of the program.
         * <p>
         * If this is not set, it defaults to the value returned by
         * {@code g_get_application_name()}.
         * @param programName The value for the {@code program-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProgramName(java.lang.String programName) {
            names.add("program-name");
            values.add(org.gtk.gobject.Value.create(programName));
            return this;
        }
        
        /**
         * Information about the system on which the program is running.
         * <p>
         * This information is displayed in a separate page, therefore it is fine
         * to use a long multi-paragraph text. Note that the text should contain
         * the intended linebreaks.
         * <p>
         * The text may contain links in this format {@code <http://www.some.place/>}
         * and email references in the form {@code <mail-to@some.body>}, and these will
         * be converted into clickable links.
         * @param systemInformation The value for the {@code system-information} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSystemInformation(java.lang.String systemInformation) {
            names.add("system-information");
            values.add(org.gtk.gobject.Value.create(systemInformation));
            return this;
        }
        
        /**
         * Credits to the translators.
         * <p>
         * This string should be marked as translatable.
         * <p>
         * The string may contain email addresses and URLs, which will be displayed
         * as links, see the introduction for more details.
         * @param translatorCredits The value for the {@code translator-credits} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTranslatorCredits(java.lang.String translatorCredits) {
            names.add("translator-credits");
            values.add(org.gtk.gobject.Value.create(translatorCredits));
            return this;
        }
        
        /**
         * The version of the program.
         * @param version The value for the {@code version} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVersion(java.lang.String version) {
            names.add("version");
            values.add(org.gtk.gobject.Value.create(version));
            return this;
        }
        
        /**
         * The URL for the link to the website of the program.
         * <p>
         * This should be a string starting with {@code http://} or {@code https://}.
         * @param website The value for the {@code website} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWebsite(java.lang.String website) {
            names.add("website");
            values.add(org.gtk.gobject.Value.create(website));
            return this;
        }
        
        /**
         * The label for the link to the website of the program.
         * @param websiteLabel The value for the {@code website-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWebsiteLabel(java.lang.String websiteLabel) {
            names.add("website-label");
            values.add(org.gtk.gobject.Value.create(websiteLabel));
            return this;
        }
        
        /**
         * Whether to wrap the text in the license dialog.
         * @param wrapLicense The value for the {@code wrap-license} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWrapLicense(boolean wrapLicense) {
            names.add("wrap-license");
            values.add(org.gtk.gobject.Value.create(wrapLicense));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_about_dialog_new = Interop.downcallHandle(
                "gtk_about_dialog_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_add_credit_section = Interop.downcallHandle(
                "gtk_about_dialog_add_credit_section",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_artists = Interop.downcallHandle(
                "gtk_about_dialog_get_artists",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_authors = Interop.downcallHandle(
                "gtk_about_dialog_get_authors",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_comments = Interop.downcallHandle(
                "gtk_about_dialog_get_comments",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_copyright = Interop.downcallHandle(
                "gtk_about_dialog_get_copyright",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_documenters = Interop.downcallHandle(
                "gtk_about_dialog_get_documenters",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_license = Interop.downcallHandle(
                "gtk_about_dialog_get_license",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_license_type = Interop.downcallHandle(
                "gtk_about_dialog_get_license_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_logo = Interop.downcallHandle(
                "gtk_about_dialog_get_logo",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_logo_icon_name = Interop.downcallHandle(
                "gtk_about_dialog_get_logo_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_program_name = Interop.downcallHandle(
                "gtk_about_dialog_get_program_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_system_information = Interop.downcallHandle(
                "gtk_about_dialog_get_system_information",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_translator_credits = Interop.downcallHandle(
                "gtk_about_dialog_get_translator_credits",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_version = Interop.downcallHandle(
                "gtk_about_dialog_get_version",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_website = Interop.downcallHandle(
                "gtk_about_dialog_get_website",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_website_label = Interop.downcallHandle(
                "gtk_about_dialog_get_website_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_wrap_license = Interop.downcallHandle(
                "gtk_about_dialog_get_wrap_license",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_artists = Interop.downcallHandle(
                "gtk_about_dialog_set_artists",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_authors = Interop.downcallHandle(
                "gtk_about_dialog_set_authors",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_comments = Interop.downcallHandle(
                "gtk_about_dialog_set_comments",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_copyright = Interop.downcallHandle(
                "gtk_about_dialog_set_copyright",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_documenters = Interop.downcallHandle(
                "gtk_about_dialog_set_documenters",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_license = Interop.downcallHandle(
                "gtk_about_dialog_set_license",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_license_type = Interop.downcallHandle(
                "gtk_about_dialog_set_license_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_logo = Interop.downcallHandle(
                "gtk_about_dialog_set_logo",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_logo_icon_name = Interop.downcallHandle(
                "gtk_about_dialog_set_logo_icon_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_program_name = Interop.downcallHandle(
                "gtk_about_dialog_set_program_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_system_information = Interop.downcallHandle(
                "gtk_about_dialog_set_system_information",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_translator_credits = Interop.downcallHandle(
                "gtk_about_dialog_set_translator_credits",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_version = Interop.downcallHandle(
                "gtk_about_dialog_set_version",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_website = Interop.downcallHandle(
                "gtk_about_dialog_set_website",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_website_label = Interop.downcallHandle(
                "gtk_about_dialog_set_website_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_set_wrap_license = Interop.downcallHandle(
                "gtk_about_dialog_set_wrap_license",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_about_dialog_get_type = Interop.downcallHandle(
                "gtk_about_dialog_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_about_dialog_get_type != null;
    }
}
