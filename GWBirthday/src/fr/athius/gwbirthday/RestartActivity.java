/** This file is part of GWBirthday.

    GWBirthday is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    GWBirthday is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.

	@year: 2011
	@author: Romain LEGUAY
	@mail: romain.leguay@gmail.com
 */
package fr.athius.gwbirthday;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Romain
 *
 */
public class RestartActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
        setContentView(R.layout.restart);
	    TextView happyBirthday = (TextView) findViewById(R.id.happy_birhtday_text);
	    Typeface font = Typeface.createFromAsset(getAssets(), "gretoonhighlight.ttf");
	    happyBirthday.setTypeface(font);
	}

}
