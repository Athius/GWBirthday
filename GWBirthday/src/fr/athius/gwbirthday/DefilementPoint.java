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
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DefilementPoint extends Activity {
	
	private static final int MAX_POINT = 12;
	
	private static int currentPoint = MAX_POINT;
	
	private Button beerButton;
	private Button fireButton;
	private Button speedButton;
	private Button stopButton;
	
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.defilement_points);
    
        beerButton = (Button) findViewById(R.id.beer_button);
        beerButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	DefilementPoint.updateCurrentPoint(6);
            	
            }
        });
//        TextView tv = new TextView(this);
//        tv.setText("Hello, Android");
//        setContentView(tv);
    }
    
    private static void updateCurrentPoint(int point) {
    	currentPoint -= 6;
    }
}
