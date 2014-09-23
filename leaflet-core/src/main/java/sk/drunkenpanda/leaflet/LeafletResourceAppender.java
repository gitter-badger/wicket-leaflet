/*
 * Copyright 2014 Jan Ferko.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sk.drunkenpanda.leaflet;

import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.application.IComponentInstantiationListener;
import sk.drunkenpanda.leaflet.resources.LeafletResourcesBehavior;

/**
 * Listener, that appends Leaflet resources to all rendered pages.
 * 
 * @author Jan Ferko 
 */
public class LeafletResourceAppender implements IComponentInstantiationListener {
    
    public LeafletResourceAppender() {        
    }

    /**
     * {@inheritDoc }     
     */
    @Override
    public void onInstantiation(Component component) {
        if (component instanceof Page) {
            component.add(LeafletResourcesBehavior.instance());
        }
    }

}