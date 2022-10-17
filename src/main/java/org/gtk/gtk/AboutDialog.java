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
 * 
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
 * 
 * <h2>CSS nodes</h2>
 * {@code GtkAboutDialog} has a single CSS node with the name {@code window} and style
 * class {@code .aboutdialog}.
 */
public class AboutDialog extends Window implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public AboutDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AboutDialog */
    public static AboutDialog castFrom(org.gtk.gobject.Object gobject) {
        return new AboutDialog(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_about_dialog_new = Interop.downcallHandle(
        "gtk_about_dialog_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_about_dialog_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkAboutDialog}.
     */
    public AboutDialog() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_about_dialog_add_credit_section = Interop.downcallHandle(
        "gtk_about_dialog_add_credit_section",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new section in the "Credits" page.
     */
    public @NotNull void addCreditSection(@NotNull java.lang.String sectionName, @NotNull java.lang.String[] people) {
        try {
            gtk_about_dialog_add_credit_section.invokeExact(handle(), Interop.allocateNativeString(sectionName), Interop.allocateNativeArray(people));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_get_artists = Interop.downcallHandle(
        "gtk_about_dialog_get_artists",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the names of the artists which are displayed
     * in the credits page.
     */
    public PointerString getArtists() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_artists.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_about_dialog_get_authors = Interop.downcallHandle(
        "gtk_about_dialog_get_authors",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the names of the authors which are displayed
     * in the credits page.
     */
    public PointerString getAuthors() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_authors.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_about_dialog_get_comments = Interop.downcallHandle(
        "gtk_about_dialog_get_comments",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the comments string.
     */
    public @Nullable java.lang.String getComments() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_comments.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_copyright = Interop.downcallHandle(
        "gtk_about_dialog_get_copyright",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the copyright string.
     */
    public @Nullable java.lang.String getCopyright() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_copyright.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_documenters = Interop.downcallHandle(
        "gtk_about_dialog_get_documenters",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the documenters which are displayed
     * in the credits page.
     */
    public PointerString getDocumenters() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_documenters.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle gtk_about_dialog_get_license = Interop.downcallHandle(
        "gtk_about_dialog_get_license",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the license information.
     */
    public @Nullable java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_license_type = Interop.downcallHandle(
        "gtk_about_dialog_get_license_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the license type.
     */
    public @NotNull License getLicenseType() {
        int RESULT;
        try {
            RESULT = (int) gtk_about_dialog_get_license_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new License(RESULT);
    }
    
    private static final MethodHandle gtk_about_dialog_get_logo = Interop.downcallHandle(
        "gtk_about_dialog_get_logo",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the paintable displayed as logo in the about dialog.
     */
    public @Nullable org.gtk.gdk.Paintable getLogo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_logo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_about_dialog_get_logo_icon_name = Interop.downcallHandle(
        "gtk_about_dialog_get_logo_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the icon name displayed as logo in the about dialog.
     */
    public @Nullable java.lang.String getLogoIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_logo_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_program_name = Interop.downcallHandle(
        "gtk_about_dialog_get_program_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the program name displayed in the about dialog.
     */
    public @Nullable java.lang.String getProgramName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_program_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_system_information = Interop.downcallHandle(
        "gtk_about_dialog_get_system_information",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the system information that is shown in the about dialog.
     */
    public @Nullable java.lang.String getSystemInformation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_system_information.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_translator_credits = Interop.downcallHandle(
        "gtk_about_dialog_get_translator_credits",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the translator credits string which is displayed
     * in the credits page.
     */
    public @Nullable java.lang.String getTranslatorCredits() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_translator_credits.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_version = Interop.downcallHandle(
        "gtk_about_dialog_get_version",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the version string.
     */
    public @Nullable java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_version.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_website = Interop.downcallHandle(
        "gtk_about_dialog_get_website",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the website URL.
     */
    public @Nullable java.lang.String getWebsite() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_website.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_website_label = Interop.downcallHandle(
        "gtk_about_dialog_get_website_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the label used for the website link.
     */
    public @Nullable java.lang.String getWebsiteLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_about_dialog_get_website_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_about_dialog_get_wrap_license = Interop.downcallHandle(
        "gtk_about_dialog_get_wrap_license",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the license text in the about dialog is
     * automatically wrapped.
     */
    public boolean getWrapLicense() {
        int RESULT;
        try {
            RESULT = (int) gtk_about_dialog_get_wrap_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_about_dialog_set_artists = Interop.downcallHandle(
        "gtk_about_dialog_set_artists",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the names of the artists to be displayed
     * in the "Credits" page.
     */
    public @NotNull void setArtists(@NotNull java.lang.String[] artists) {
        try {
            gtk_about_dialog_set_artists.invokeExact(handle(), Interop.allocateNativeArray(artists));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_authors = Interop.downcallHandle(
        "gtk_about_dialog_set_authors",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the names of the authors which are displayed
     * in the "Credits" page of the about dialog.
     */
    public @NotNull void setAuthors(@NotNull java.lang.String[] authors) {
        try {
            gtk_about_dialog_set_authors.invokeExact(handle(), Interop.allocateNativeArray(authors));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_comments = Interop.downcallHandle(
        "gtk_about_dialog_set_comments",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the comments string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     */
    public @NotNull void setComments(@Nullable java.lang.String comments) {
        try {
            gtk_about_dialog_set_comments.invokeExact(handle(), Interop.allocateNativeString(comments));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_copyright = Interop.downcallHandle(
        "gtk_about_dialog_set_copyright",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the copyright string to display in the about dialog.
     * <p>
     * This should be a short string of one or two lines.
     */
    public @NotNull void setCopyright(@Nullable java.lang.String copyright) {
        try {
            gtk_about_dialog_set_copyright.invokeExact(handle(), Interop.allocateNativeString(copyright));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_documenters = Interop.downcallHandle(
        "gtk_about_dialog_set_documenters",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the names of the documenters which are displayed
     * in the "Credits" page.
     */
    public @NotNull void setDocumenters(@NotNull java.lang.String[] documenters) {
        try {
            gtk_about_dialog_set_documenters.invokeExact(handle(), Interop.allocateNativeArray(documenters));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_license = Interop.downcallHandle(
        "gtk_about_dialog_set_license",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the license information to be displayed in the
     * about dialog.
     * <p>
     * If {@code license} is {@code NULL}, the license page is hidden.
     */
    public @NotNull void setLicense(@Nullable java.lang.String license) {
        try {
            gtk_about_dialog_set_license.invokeExact(handle(), Interop.allocateNativeString(license));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_license_type = Interop.downcallHandle(
        "gtk_about_dialog_set_license_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the license of the application showing the about dialog from a
     * list of known licenses.
     * <p>
     * This function overrides the license set using
     * {@link AboutDialog#setLicense}.
     */
    public @NotNull void setLicenseType(@NotNull License licenseType) {
        try {
            gtk_about_dialog_set_license_type.invokeExact(handle(), licenseType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_logo = Interop.downcallHandle(
        "gtk_about_dialog_set_logo",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the logo in the about dialog.
     */
    public @NotNull void setLogo(@Nullable org.gtk.gdk.Paintable logo) {
        try {
            gtk_about_dialog_set_logo.invokeExact(handle(), logo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_logo_icon_name = Interop.downcallHandle(
        "gtk_about_dialog_set_logo_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon name to be displayed as logo in the about dialog.
     */
    public @NotNull void setLogoIconName(@Nullable java.lang.String iconName) {
        try {
            gtk_about_dialog_set_logo_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_program_name = Interop.downcallHandle(
        "gtk_about_dialog_set_program_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name to display in the about dialog.
     * <p>
     * If {@code name} is not set, the string returned
     * by {@code g_get_application_name()} is used.
     */
    public @NotNull void setProgramName(@Nullable java.lang.String name) {
        try {
            gtk_about_dialog_set_program_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_system_information = Interop.downcallHandle(
        "gtk_about_dialog_set_system_information",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the system information to be displayed in the about
     * dialog.
     * <p>
     * If {@code system_information} is {@code NULL}, the system information
     * page is hidden.
     * <p>
     * See {@code Gtk.AboutDialog:system-information}.
     */
    public @NotNull void setSystemInformation(@Nullable java.lang.String systemInformation) {
        try {
            gtk_about_dialog_set_system_information.invokeExact(handle(), Interop.allocateNativeString(systemInformation));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_translator_credits = Interop.downcallHandle(
        "gtk_about_dialog_set_translator_credits",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the translator credits string which is displayed in
     * the credits page.
     * <p>
     * The intended use for this string is to display the translator
     * of the language which is currently used in the user interface.
     * Using {@code gettext()}, a simple way to achieve that is to mark the
     * string for translation:
     * 
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
     */
    public @NotNull void setTranslatorCredits(@Nullable java.lang.String translatorCredits) {
        try {
            gtk_about_dialog_set_translator_credits.invokeExact(handle(), Interop.allocateNativeString(translatorCredits));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_version = Interop.downcallHandle(
        "gtk_about_dialog_set_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the version string to display in the about dialog.
     */
    public @NotNull void setVersion(@Nullable java.lang.String version) {
        try {
            gtk_about_dialog_set_version.invokeExact(handle(), Interop.allocateNativeString(version));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_website = Interop.downcallHandle(
        "gtk_about_dialog_set_website",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the URL to use for the website link.
     */
    public @NotNull void setWebsite(@Nullable java.lang.String website) {
        try {
            gtk_about_dialog_set_website.invokeExact(handle(), Interop.allocateNativeString(website));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_website_label = Interop.downcallHandle(
        "gtk_about_dialog_set_website_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the label to be used for the website link.
     */
    public @NotNull void setWebsiteLabel(@NotNull java.lang.String websiteLabel) {
        try {
            gtk_about_dialog_set_website_label.invokeExact(handle(), Interop.allocateNativeString(websiteLabel));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_about_dialog_set_wrap_license = Interop.downcallHandle(
        "gtk_about_dialog_set_wrap_license",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the license text in the about dialog should be
     * automatically wrapped.
     */
    public @NotNull void setWrapLicense(@NotNull boolean wrapLicense) {
        try {
            gtk_about_dialog_set_wrap_license.invokeExact(handle(), wrapLicense ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateLinkHandler {
        boolean signalReceived(AboutDialog source, @NotNull java.lang.String uri);
    }
    
    /**
     * Emitted every time a URL is activated.
     * <p>
     * Applications may connect to it to override the default behaviour,
     * which is to call {@link Gtk#showUri}.
     */
    public SignalHandle onActivateLink(ActivateLinkHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-link"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AboutDialog.Callbacks.class, "signalAboutDialogActivateLink",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalAboutDialogActivateLink(MemoryAddress source, MemoryAddress uri, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AboutDialog.ActivateLinkHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new AboutDialog(Refcounted.get(source)), uri.getUtf8String(0));
        }
        
    }
}
