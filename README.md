# Demo

## Commits

* Rollback last commit: `git reset --hard HEAD^` then `git push -f`

## Tags

* Get local tags: `git tag`
* Get remote tags: `git ls-remote --tags origin`
* Create local tag: `git tag <tag>`
* Create remote tag: `git push origin <tag>`
* Delete local tag: `git tag -d <tag>`
* Delete remote tag: `git push --delete origin <tag>`

## Release

* `git add .`
* `git commit -m "Release module1-1.0.0"`
* `git tag module1-1.0.0` or `git tag -a v1.73.0 -m "Latest release (or some message)"`
* `get push` or `git push origin master`
* `git push origin module1-1.0.0`
