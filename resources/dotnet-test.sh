projects=`find . -regex '.*\\.Test\\.csproj'`
for project in $projects
do
  dotnet test $project --configuration $CONFIGURATION
done
