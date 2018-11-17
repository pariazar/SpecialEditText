<h1>Fast EditText</h1>
Find your favorite animation and easily start it for editText
there are different animations that let you choose them better.
<h2>Screenshots</h2>
<img src="http://downloadcenter.pariazar.ir/git/1.gif" alt="Fast EditText">
<h2>Getting Started</h2>
you need to add

          allprojects {
		repositories {
			
			maven { url 'https://jitpack.io' }
		}
   	}
 
<h2>Usage</h2>
define it in your layout

	 <com.decoder.hamedpa.fastedittext.FView
    	    android:id="@+id/fview"
     	   android:layout_width="300dp"
     	   android:layout_height="30dp"
      	  android:layout_marginTop="62dp"/>
to use Fast EditText, first define FView

     FView fView  = (FView) findViewById(R.id.fview);
             
<h3>Start Animation</h3>
then you will able to start animation with StartAnimations method


    fView.startAnimations(9);

<h3>Customize</h3>
<img src="http://downloadcenter.pariazar.ir/git/fastedittext.png" alt="Fast EditText">
The 3D animation effect that you want to set on View

    fView.startAnimations(2,imageView);




