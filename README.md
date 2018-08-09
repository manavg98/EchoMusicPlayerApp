# Echo Music Player App

 Echo is a Music Player App for Android designed only using Kotlin.

- A Splash screen (gradient background and app logo in center).
- A Navigation drawer with app logo section at the top along with links to ‘All Songs’, ‘Favorites’, ‘Settings’ and ‘About Us’.
- An ‘All songs’ screen (where of list all the tracks fetched from offline storage are displayed and user can sort the tracks by name or recently added). This will the home screen of the app.
- The app should be able to fetch and play .mp3 and .wav files.
- A ‘Favorites’ screen (where list of all the favorite songs are displayed)
- A ‘Settings’ screen (where the ‘Shake to change song’ feature can be enabled or disabled)
- An ‘About us’ screen (where we will display information about the app developer and the app version)
- A ‘Now playing’ screen with following features:
  - Track title and track artist
  - Play / Pause button
  - Next button
  - Previous button
  - Shuffle button
  - Loop button
  - Seek bar
  - Mark track as favorite or unfavorite it
  - Third party visualiser in upper half background
  - A ‘Back to list’ button in the header which should take the user to the screen he came from (kind of like back button behaviour).
  - Shake to change song
- A ‘Now playing’ bar at the bottom with name of the track playing and play or pause feature. This would appear if the user has moved from ‘Now playing’ screen to ‘All songs’ screen or ‘Favorites’ screen without pausing the track.
- Background play. The app will continue playing the track if the app gets closed (not killed) without the music being paused.
- A notification saying "A track is playing in the background" only if the app gets closed (not killed) without the music being paused.
