/*
 * Copyright 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package antidote.antidote;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

//import com.example.android.animationsdemo.R;

/**
 * A fragment representing a single step in a wizard. The fragment shows a dummy title indicating
 * the page number, along with some dummy text.
 *
 * <p>This class is used by the {@link //CardFlipActivity} and {@link
 * //SaveALife} samples.</p>
 */
public class SaveALife_Fragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    //TODO
    private List<String> titleList;
    private String titleTxt;
    //TODO forstå TypedArray (for drawables)
    private TypedArray drawableList;
    private Drawable drawableItem;



    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static SaveALife_Fragment create(int pageNumber) {
        SaveALife_Fragment fragment = new SaveALife_Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public SaveALife_Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_save_a_life, container, false);
        titleTxt = getTitleTxt();
        drawableItem = getDrawableItem();

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(R.id.title_save_a_life)).setText(
                titleTxt);

        ((ImageView) rootView.findViewById(R.id.drawable_save_a_life)).setImageDrawable(
                drawableItem);
        //TODO ((TextView) rootView.findViewById(android.R.id.text2)).setText(getString(R.string.description, titleTxt));

        return rootView;
    }

    public String getTitleTxt() {
        //TODO ITS ALIVE!!!!!! HURRA!
        titleList = Arrays.asList(getResources().getStringArray(R.array.SaveALife_Titles));
        titleTxt = titleList.get(mPageNumber);
        return titleTxt;
    }

    public Drawable getDrawableItem() {
        //TODO ITS ALIVE!!!!!! HURRA!
        drawableList = getResources().obtainTypedArray(R.array.SaveALife_Drawables);
        drawableItem = drawableList.getDrawable(mPageNumber);
        return drawableItem;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}
