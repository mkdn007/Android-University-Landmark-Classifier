# Android-University-Landmark-Classifier
*Android app that identifies UT and UTD landmarks*

**Goal:** Create a valuable resource for students, campus members, and the general public if they need quick access to information in order to learn more about their university. 

**Project Demo:** https://drive.google.com/file/d/1CXncF-4itkERrPvYgpNN8AdFgt3s4AcU/view?usp=sharing

**Paper:** https://drive.google.com/drive/folders/1xac880CPJmJwW9BjwqDhgR2E9UCA7yIZ

I hope my app could potentially be used by a university to help their students on campus tours, or by the public to learn more about their favorite universities on the go.

**Model:**
- **University_Image_Classification_on_Android.ipynb** is a model I created in TensorFlow utilizing Transfer Learning on VGG16.
- **labels.txt** includes all the classes I trained my model on.
- **university_model.tflite** is my model converted into a .tflite file format using TensorFlow Lite.
- **Colab:** https://colab.research.google.com/drive/1dLbMKrj2IvKQK7Tsaj3yJBYD4HwhuzoM?usp=sharing

**Android:**
* **/source code/university_landmark_classifier** is my app project I created in Android Studio. To open the project in Android Studio, please select "Open an existing Android Studio Project" on the start up menu. Refer to **android_studio_help.png**. Select the folder "university_landmark_classiier".
- **university_landmark_classifier.apk** is the APK file of my Android app. Install this into your phone to use. 

