# 2024/mat.py

import matplotlib.pyplot as plt

years = [1950,1960,1970,1980,1990,2000,2010]
gdp = [67.0,80.0,257.0,1686.0,6506,11865.3,22105.3]

plt.plot(years,gdp,color='green',marker='o',linestyle='solid')
plt.title("GDP per capita")

plt.ylabel("dallars")
plt.savefig("gdp.png",dpi=600)

plt.show()

