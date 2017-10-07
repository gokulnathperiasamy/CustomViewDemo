# CustomViewDemo

> Steps to create a Custom View in Android:

- Create [attrs.xml](https://github.com/gokulnathperiasamy/CustomViewDemo/blob/master/app/src/main/res/values/attrs.xml) under res\values.
- Create [view_custom.xml](https://github.com/gokulnathperiasamy/CustomViewDemo/blob/master/app/src/main/res/layout/view_custom.xml) under layout.
- Create [CustomView.java](https://github.com/gokulnathperiasamy/CustomViewDemo/blob/master/app/src/main/java/com/kpgn/customviewdemo/CustomView.java) for binding.
- Add the custom view in layout file.
```
    <com.kpgn.customviewdemo.CustomView
        android:id="@+id/cv_view02"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        custom:longDescription="Long Description ... "
        custom:titleText="Short Title" />
```
- Find the CustomView added to the layout, and update the content:
```
    CustomView mCustomView02 = (CustomView) findViewById(R.id.cv_view02);
    mCustomView02.setTopicHeader("New Long Header...");
    mCustomView02.setLongDescription("Longest Description... New..");
```
