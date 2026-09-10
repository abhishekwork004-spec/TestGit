# TestGit

A sandbox repository. Nothing here is real code.

It exists so the team can see what a commit, a pull request and a merge
actually look like as a change moves from a laptop to production.

## Branches

| Branch | Stage | Who writes to it |
|---|---|---|
| `CERTInext-Dev` | Development | every developer, through a pull request |
| `CICD-K8-QA` | QA | release manager, by promoting Dev |
| `CICD-K8-Demo` | Demo | release manager, by promoting QA |
| `CICD-K8-SB` | Sandbox | release manager, by promoting QA |
| `CICD-K8-Production` | Production | release manager only |

`main` holds this README and is the base every stage branch was cut from.
It is not deployed anywhere.

## Rules the demo follows

1. Nobody commits straight to a stage branch. Every change arrives by pull request.
2. A ticket branch is squashed into `CERTInext-Dev`, so one ticket is one commit.
3. A promotion is a merge commit, so the commits stay visible and nothing is rewritten.
4. A version number is set once, on one commit, and tagged. It never moves.
5. A production hotfix is merged back into `CERTInext-Dev` the same day.
