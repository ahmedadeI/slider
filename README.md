# slider

This repository contains a small Java project. I added GitHub Codespaces and a CI workflow to help your team collaborate online.

What I added
- .devcontainer/devcontainer.json — preconfigured Codespaces/devcontainer image with Java tooling
- .github/workflows/ci.yml — GitHub Actions workflow that compiles the Java sources and runs Main if present

How to publish and use with your team
1. Create a GitHub repository (public or private) via the GitHub UI.
2. Add the remote to your local repo and push:

```
git remote add origin <GIT_URL>
git push -u origin master
```

3. Open the repository in GitHub and click "Code" -> "Codespaces" to create a Codespace (or click "Open in Codespaces").

If you'd like, provide the repository URL here and I can add the remote and push for you (or install the GitHub CLI locally and create the repo if you prefer).
