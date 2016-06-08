# RoundCornerProgressBar
Round Corner Progress Bar Library for Android

Colorful progress bar with round corner on progress which you can customized a color and corner radius.

Preview
===========================
![Icon Round Corner Progress Bar Usage](https://github.com/TheMelody/RoundCornerProgressBar/blob/master/Screenshot_20160608-151511.png)
![Icon Round Corner Progress Bar Usage](https://github.com/TheMelody/RoundCornerProgressBar/blob/master/Screenshot_20160608-151649.png)
![Icon Round Corner Progress Bar Usage](https://github.com/TheMelody/RoundCornerProgressBar/blob/master/Screenshot_20160608-151908.png)
![Icon Round Corner Progress Bar Usage](https://github.com/TheMelody/RoundCornerProgressBar/blob/master/Screenshot_20160608-152012.png)


Usage
===========================
Define 'app' namespace on root view in your layout

```xml
xmlns:round="http://schemas.android.com/apk/res-auto"
```


Include this progress bar library in your layout

```xml
 <org.devloper.melody.corner.RoundCornerProgressBar
        android:id="@+id/pb_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/tv_custom_lable"
        android:layout_margin="10dp"
        android:padding="7dp"
        round:round_corner_background_color="@color/pb_progress_bg_color"
        round:round_corner_progress_color="@color/pb_progress_color"
        round:round_corner_width="15dp" />
```

Licence
===========================
Copyright 2016 TheMelody

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
