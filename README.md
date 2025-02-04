## _Sauce Labs_ My Demo App
#### _`Android`_  Edition

<br>
<img align="right" src="assets/logo_7.png">  



| :rocket: [Sign Up for a _free_ trial at Sauce Labs][400] :bangbang: |
|:----------------------------------------------------------------- |
| :white_check_mark: Real Device Cloud                              |
| :white_check_mark: Beta Testing                                   |
| :page_facing_up: _`TestFairy`_ [Documentation][200]                  |
| :page_facing_up: _`TestFairy`_ [API Reference][300]                  |
| :page_facing_up: _`Sauce Labs`_ [Documentation Central][500]                  |

&nbsp;

[400]: https://saucelabs.com/sign-up
[200]: https://docs.testfairy.com/Getting_Started/Getting_Started.html
[300]: https://docs.testfairy.com/API/Upload_API.html
[500]: https://docs.saucelabs.com/

<br>

## Build Local


### Install Dependencies

```shell
brew install --cask android-studio
```

<br>

### Set Environment Variables


Export your TestFairy SDK app token from [TestFairy Settings][100].

```shell
export TESTFAIRY_SDK_TOKEN=""

# android studio
launchctl setenv TESTFAIRY_SDK_TOKEN ${TESTFAIRY_SDK_TOKEN}
```

<br>

Set the environment variables below to automate the upload to TestFairy & Sauce Storage for distribution.

```shell
export TESTFAIRY_UPLOAD="TRUE"

export TESTFAIRY_API_KEY=""
export SAUCE_USERNAME=""
export SAUCE_ACCESS_KEY=""

# android studio
launchctl setenv TESTFAIRY_UPLOAD ${TESTFAIRY_UPLOAD}

# default is us-west-1, set for the EU data centre
# export SAUCE_DC="eu-central-1"
```


<br>


### Generate a Signing Key

```shell
chmod +x buildKeystore
./buildKeystore
```


<br>

### Build 

```shell
chmod +x buildSauce
./buildSauce clean
```

[100]: https://testfairy.saucelabs.com/settings
