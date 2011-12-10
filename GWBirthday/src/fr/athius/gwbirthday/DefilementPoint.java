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
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class DefilementPoint extends Activity {

	private static final int MAX_POINT = 12;

	private int p_currentPoint = MAX_POINT;

	private ViewFlipper p_flipper;

	private Button p_beerButton;
	private Button p_fireButton;
	private Button p_speedButton;
	private Button p_stopButton;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.defilement_points);

		// Flipper contains the text (the number of points) and is in charge of
		// animation.
		p_flipper = (ViewFlipper) findViewById(R.id.flipper);

		p_flipper.setAnimation(AnimationUtils.loadAnimation(this,
				R.anim.push_down));
		
		p_currentPoint = MAX_POINT;
		
		// Beer or not to beer... it's not a question it's an evidence!!
		p_beerButton = (Button) findViewById(R.id.beer_button);
		p_beerButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DefilementPoint.this.updateCurrentPoint(6);
				Toast.makeText(DefilementPoint.this, "Mais j'en ai bu qu'une!!", Toast.LENGTH_SHORT).show();
			}
		});

		p_fireButton = (Button) findViewById(R.id.fire_button);
		p_fireButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DefilementPoint.this.updateCurrentPoint(4);
				Toast.makeText(DefilementPoint.this, "Il était vert!", Toast.LENGTH_SHORT).show();
			}
		});

		p_speedButton = (Button) findViewById(R.id.speed_button);
		p_speedButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DefilementPoint.this.updateCurrentPoint(4);
				Toast.makeText(DefilementPoint.this, "J'ai pas vu le 1 devant...", Toast.LENGTH_SHORT).show();
			}
		});

		p_stopButton = (Button) findViewById(R.id.stop_button);
		p_stopButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				DefilementPoint.this.updateCurrentPoint(4);
				Toast.makeText(DefilementPoint.this, "Il n'y avait personne!", Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void updateCurrentPoint(int point) {
		if (p_currentPoint - point <= 0) {
			for (int nbFlip = 0; nbFlip < p_currentPoint; ++nbFlip) {
				p_flipper.showNext();
			}
			
			Intent intent = new Intent(this, RestartActivity.class);
			startActivity(intent);
		} else {
			p_currentPoint -= point;
			for (int nbFlip = 0; nbFlip < point; ++nbFlip) {
				p_flipper.showNext();
			}
		}
	}
}
