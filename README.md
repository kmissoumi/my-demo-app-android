# my-demo-app-android




## Spoon for Espresso

```shell
# build
./gradlew :app:clean
./gradlew :app:assembleDebug :app:assembleDebugAndroidTest 

# run
 export CI_COMMIT_SHORT_SHA=$(date +"%Y-%m-%d_%H%M%S_%s")
 saucectl run --verbose
```

| Platform || Status | Job
|   :--:|:- | :--: | :--:  
Android 9 | ✅  | passed | [edcedfba08f641b693da18447844a43e][200]
Android 10 | ❌  |failed | [6358bdc5c9a04ca2917a4ddc22bc8f4b][210]
Android 11 | ❌  | failed | [e5e6d98e554d4d859032283f89f34ab1][220]

[RDC Build #76638c062caf32e4b329188767985def][100]
 
[100]: https://app.saucelabs.com/builds/rdc/76638c062caf32e4b329188767985def

[200]: https://app.saucelabs.com/tests/edcedfba08f641b693da18447844a43e
[210]: https://app.saucelabs.com/tests/6358bdc5c9a04ca2917a4ddc22bc8f4b
[220]: https://app.saucelabs.com/tests/e5e6d98e554d4d859032283f89f34ab1


[300]: ./artifacts/Release-2022-07-25_160147_1658757707
[310]: ./artifacts/Release-2022-07-25_160147_1658757707/job_info_edcedfba08f641b693da18447844a43e.json

`
Caused by: java.lang.IllegalAccessException: Unable to create output dir: /storage/emulated/0/app_spoon-screenshots
`

<br>
<br>

### API Validation

Logs and output are in the _[artifacts][300]_ directory. Full response response [here][310].
```json
  "screenshots": [
    {
      "id": "218",
      "url": "https://api.us-west-1.saucelabs.com/v1/rdc/jobs/edcedfba08f641b693da18447844a43e/screenshots/218"
    },
    {
      "id": "219",
      "url": "https://api.us-west-1.saucelabs.com/v1/rdc/jobs/edcedfba08f641b693da18447844a43e/screenshots/219"
    },
    {
      "id": "220",
      "url": "https://api.us-west-1.saucelabs.com/v1/rdc/jobs/edcedfba08f641b693da18447844a43e/screenshots/220"
    },
    {
      "id": "221",
      "url": "https://api.us-west-1.saucelabs.com/v1/rdc/jobs/edcedfba08f641b693da18447844a43e/screenshots/221"
    },
    {
      "id": "222",
      "url": "https://api.us-west-1.saucelabs.com/v1/rdc/jobs/edcedfba08f641b693da18447844a43e/screenshots/222"
    }
  ],
  ```


