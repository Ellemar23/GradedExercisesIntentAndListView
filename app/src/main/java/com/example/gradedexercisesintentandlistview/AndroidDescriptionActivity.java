package com.example.gradedexercisesintentandlistview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidDescriptionActivity extends AppCompatActivity {
    TextView AndroidNameTextView, AndroidDescriptionTextView;
    ImageView AndroidImageView;
    Button backButton;
    @Override
    protected  void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_android_details);

        // Initialize the views
        AndroidNameTextView = findViewById(R.id.AndroidVersionTextView);
        AndroidDescriptionTextView = findViewById(R.id.AndroidDescriptionTextView);
        AndroidImageView = findViewById(R.id.AndroidImageView);
        backButton = findViewById(R.id.backButton);

        // Get the data from the intent
        String AndroidVersion = getIntent().getStringExtra("AndroidVersion");
        int AndroidImage = getIntent().getIntExtra("AndroidImage", 0);

        // Set the data to the views
        AndroidNameTextView.setText(AndroidVersion);
        AndroidImageView.setImageResource(AndroidImage);
        AndroidDescriptionTextView.setText(getDescription(AndroidVersion));

        // Set the back button click listener
        backButton.setOnClickListener(v -> finish());
    }

    private String getDescription(String AndroidVersion) {
        switch (AndroidVersion) {

            case "Android 1.0":
                return "Android 1.0 was Google's first Android\n" +
                        "release. Web browser support, camera\n" +
                        "support, Gmail counts, Google maps, and a YouTube application were among the basic\n" +
                        "capabilities. Although it does not have\n" +
                        "an official name like the other introduced\n" +
                        "variations, it is known informally as Apple\n" +
                        "Pie. In Android 1.0, the API level is set to 1\n" +
                        "It is no longer utilized in mobile devices It\n" +
                        "was published on September 23, 2008\n";
            case "Android 1.1":
                return "Google released Android 1.1, which is the second version of the operating system.\n" +
                        "It included all of the features seen in the previous version, including This version\n" +
                        "improved upon Android 1.0 by adding a\n" +
                        "fow no res Caller application few new features. Caller applications now\n" +
                        "have several new capabilities, such as\n" +
                        "the ability to hide and expose the numeric\n" +
                        "keyboard. This version also has a function\n" +
                        "for preserving MMS attachments. It also\n" +
                        "does not have an official version name\n" +
                        "like Android 1.0, although it is known as\n" +
                        "Banana Bread informally. It came out on February 9, 2009.";
            case "CupCake":
                return "The tradition off Android version name\n" +
                        "started with the release ofAndroid\n" +
                        "1.5 Cupcake in early 2009. Cupcake brought a slew of improvements to th\n" +
                        "Android interface, including the first\n" +
                        "on-screen keyboard, which would become increasingly important as phones moved\n" +
                        "away from the once-ubiquitous physical\n" +
                        "keyboard format. Cupcake also included\n" +
                        "the framework for third-party aon widoets r app which would fast become one of Android's\n" +
                        "most distinctive features, r as wellas the\n" +
                        "platform's first-ever video recording option.";
            case "Donut":
                return "Donut, Android 1.6, was introduced intthe fall of 2009. Donut fixed key important\n" +
                        "holes in Android's core, including the\n" +
                        "OS's ability to function on a wide range of\n" +
                        "screen sizes and resolutions, which was a crucial feature. in the Years ahead It also\n" +
                        "introduced support for CDMA networks\n" +
                        "like as Verizon, which will be crucial in Android's rapid growth.\n";
            case "Eclair":
                return "Android 2.0 Eclair is an Android version\n" +
                        "based on the Linux kernel 2.6.29 that wa\n" +
                        "released on October 26, 2009. Android 1.6\n" +
                        "Donut was its predecessor, while Android\n" +
                        "2.1 Eclair was\n" +
                        "presented by Motorola's Droid. Android\n" +
                        "2.0 was updated to Android 2.1.0 eclair\n" +
                        "on January 12, 2010. On June 30, 2017. Google stopped supporting Android 2.0 and older";
            case "Froyo":
                return "Google's Android 2.2 Froyo operating\n" +
                        "system is the company's third major release. Google tried its best to update the\n" +
                        "OS with some much-needed updates as\n" +
                        "well as new features. In May 2010, Android\n" +
                        "2.2 Froyo was released. Speed, APIs and\n" +
                        "services, browser,and Android Market are\n" +
                        "four areas from this release that you should\n" +
                        "be aware of. In terms of performance,\n" +
                        "Google launched the Dalvik JIT (Just In Time) compiler, which boosts CPU code performance by 2-5 times over Android 2.1. Google launched cloud-to-device messaging to allow developers to provide a\n" +
                        "better sync and notification experience for their user";
            case "Gingerbread":
                return "With the introduction of Gingerbread in 2010, Android's first genuine visual identity\n" +
                        "came into prominence. Bright green had\n" +
                        "long been the color of Android's robot\n" +
                        "mascot, and it became a fundamental\n" +
                        "aspect of the operating system's design\n" +
                        "with Gingerbread. As AAndroid began its\n" +
                        "long march toward unique design, black\n" +
                        "and green slipped into the UI.";
            case "Honeycomb":
                return "Honeycomb is unique in that it is a tablet-only operating system that, according to Google, will not be coming to\n" +
                        "smartphones. One noteworthy distinction\n" +
                        "in Honeycomb is that physical buttons\n" +
                        "are no longer required because they are\n" +
                        "incorporated into the OS itself. There are\n" +
                        "three software buttons on the bottom\n" +
                        "left of the screen: back, home, and the multitasking app switcher (switching\n" +
                        "between running apps). Additional\n" +
                        "information and functionality may be\n" +
                        "found in the bottom right: power, internet\n" +
                        "connection status, anda notification bar\n";
            case "Ice Cream Sandwich":
                return "Android 4.0 improves on the features that\n" +
                        "users love about Android, such as simple\n" +
                        "multitasking, rich alerts, customized home\n" +
                        "screens, resizable widgets, and deep\n" +
                        "interaction, while also introducing strong\n" +
                        "new communication and sharing options.";
            case "Jelly Bean":
                return "Android 4.3 improves on the speed\n" +
                        "enhancements introduced in Jelly Bean, such as vsync timing, triple buffering.\n" +
                        "decreased touch latency, CPU input\n" +
                        "boost, and hardware-accelerated 2D\n" +
                        "graphics, by adding new optimizations.\n" +
                        "The hardware-accelerated 2D rendere 20\n" +
                        "now optimizes the stream of drawing\n" +
                        "commands, putting it into a more efficient\n" +
                        "GPU format by reorganizing and combining\n" +
                        "draw operations for improved graphics performance. The renderer may now\n" +
                        "employ multithreading across several\n" +
                        "CPU cores to accomplish some tasks for\n" +
                        "multithreaded processing.\n";
            case "KitKat":
                return "Android 4.4 KitKat is an Android version\n" +
                        "Android 4.3 Jellybean is its predecessor,\n" +
                        "while Android 5.0 Lollipop is its successor.\n" +
                        "Kitkat aims to improve the overall user\n" +
                        "experience on the smartphone. Android\n" +
                        "4.4 was released as Android 4.4.4 on July\n" +
                        "7, 2014. KitKat 4.4 includes many new\n" +
                        "features to enhance the user experience and providea polished feel across the\n" +
                        "Android device that it is running on. Android 4.4 was designed to require\n" +
                        "less ram than before, in order to help its\n" +
                        "performance on phones with less than 1 Gigabyte of RAM.";
            case "Lollipop":
                return "Descriptior\n" +
                        "With the introduction of Android 5.0\n" +
                        "Lollipop in the autumn of 2014, Google fundamentally revamped Android once fundamantallyraumned Androida\n" +
                        "more. Lollipop introduced the still-in-use\n" +
                        "Material Design standard, which gave\n" +
                        "Android, its applications, and even other\n" +
                        "Google productsacompletely new\n" +
                        "appearance. The card-based notion that psap uoion that\n" +
                        "had been strewn across Android became\n" +
                        "a primary UI pattern, guiding the design\n" +
                        "of everything from alerts, which now s, which nом appeared on the lock screen for at-a-glance\n" +
                        "access, to the Recent Apps list, which took\n" +
                        "on an outright card-based appearance";
            case "Marshmallow":
                return "Android 6.0 Marshmallow was launched as Android M during Google 1/0 2015,\n" +
                        " and it is the successor to Android 5.1 Lollipop. It is accessible to \n" +
                        "developers as a preview release as of May 2015, and will be fully launched in the third quarter of 2015. \n" +
                        "Beautiful Begging, Google's Vice President for Android, \n" +
                        "remarked at Google I/O that 'we've gone back to the basics with Android M.\n" +
                        " We've spent a lot of time polishing and improving quality, we've actually fixed hundreds of issues.\n" +
                        " On August 17, a statue was uncovered that revealed the name: Android Marshmallow.\n" +
                        " Android 6.0 was released as Android 6.0.1 on October 3, 2017.";
            case "Nougat":
                return "In 2016, Google released Android Nougat, which included a native split-screen\n" +
                        "mode, a new bundled-by-app notification system, and a Data Saver feature. \n" +
                        "Nougat also included several minor but useful improvements, \n" +
                        "including as an Alt-Tab-like shortcut for switching apps.";
            case "Oreo":
                return "Oreo was also the first Android version to include Project Treble, an ambitious effort. \n" +
                        "to provide a modular base for Android's code" +
                        " in the hopes of making it easier\n" +
                        " for device manufacturers to provide timely software updates.";
            case "Pie":
                return "In August of 2018, the aroma of fresh baked Android Pie, also known as An 9, filled the Android ecosystem.\n" +
                        " The most significant change in Pie was it hybrid gesture/button navigation system \n" +
                        " which replaced Android's traditional E Home, and Overview keys with\n" +
                        " a large multifunctional Home button and a si Back button \n" +
                        "that appeared alongside as needed." +
                        "Pie's productivity features also included a universal suggested-r system\n" +
                        " for message alerts,\n" +
                        "a new dashboard of Digital Wellbeing setting and more intelligent \n" +
                        "algorithms for pr and screen brightness management.";
            case "Android 10":
                return "The Android environment has changed dramatically since Android 10.\n" +
                        " The rebranding marks the end of the age of dessert names,\n" +
                        " as Google has now fully embraced gesture controls.\n" +
                        " Despite these new approaches, Android remains the same OS that we are all familiar with.\n" +
                        "The main themes for Android 10 were gesture controls, \n" +
                        "increased security, and improved functionality.\n" +
                        " Overall, the upgrade feels like a continuation of Android Pie.\n" +
                        " However, when compared to Android Marshmallow and Android Oreo,\n" +
                        " there is still a significant difference between Android Pie and Android 10.";
            case "Android 11":
                return "The Android environment has changed dramatically since Android 10. \n" +
                        "The rebranding marks the end of the age of dessert names,\n" +
                        " as Google has now fully embraced gesture controls. \n" +
                        "Despite these new approaches, Android remains the same OS that\n" +
                        " we are all familiar with.\n" +
                        " The main themes for Android 10 were gesture controls, \n" +
                        "increased security, and improved functionality.\n" +
                        " Overall, the upgrade feels like a continuation of Android Pie.\n" +
                        " However, when compared to Android Marshmallow and Android Oreo, \n" +
                        "there is still a significant difference between Android Pie and Android 10.";
            case "Android 12":
                return "Android 12 is our most personal operating system ever, \n" +
                        "with dynamic color capabilities that change depending \n" +
                        "on your wallpaper and responsive motion that responds to your touch.\n" +
                        " Android 12 is meant to be accessible for even more people,\n" +
                        " with a more roomy layout, color contrast enhancements,\n" +
                        " and new tools to assist individuals with low vision. From forms,\n" +
                        " light, and motion to changeable system colors that can be changed to match you,\n" +
                        " Android 12 rethinks the whole user interface. It's our most expressive,\n" +
                        " dynamic, and personal OS yet, redesigned to be more roomy and comfy.";
                default: return "Android Version not found";
        }
    }
}
