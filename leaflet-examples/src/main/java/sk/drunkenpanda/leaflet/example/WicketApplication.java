package sk.drunkenpanda.leaflet.example;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import sk.drunkenpanda.leaflet.DefaultLeafletSettings;
import sk.drunkenpanda.leaflet.Leaflet;

/**
 * Application object for examples web application.
 *
 */
public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage() {
        return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super.init();

        DefaultLeafletSettings settings = new DefaultLeafletSettings.Builder()
                .setAutoAppendResources(true)
                .build();
        Leaflet.install(this, settings);
    }
}
