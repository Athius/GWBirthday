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
import android.widget.Button;
import android.widget.Toast;

public class GWBirthdayActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                Toast.makeText(GWBirthdayActivity.this, "Alcoooooliiiiqquuuuee!!!!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GWBirthdayActivity.this, DefilementPoint.class);
                startActivity(intent);
            }
        });
//        TextView tv = new TextView(this);
//        tv.setText("Hello, Android");
//        setContentView(tv);
    }
}