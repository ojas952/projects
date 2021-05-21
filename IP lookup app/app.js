const getAddress = document.querySelector(".getAddress");
const ipDisplay = document.querySelector(".ipDisplay");
const locationDisplay = document.querySelector(".locationDisplay");
const geoDisplay = document.querySelector(".geoDisplay");
const countryDisplay = document.querySelector(".countryDisplay");
const loader = document.querySelector(".loaderMain");
const details = document.querySelector(".details");


getAddress.addEventListener("click", () => {


    loader.style.display = "flex";
    details.style.display = "none";


    axios.get("https://ipapi.co/json/").then((response) => {


        loader.style.display = "none";
        details.style.display = "block";

        ipDisplay.textContent = `IP : ${response.data.ip}`;
        locationDisplay.textContent = `location: ${response.data.city}, ${response.data.region}`;
        geoDisplay.textContent = `Geo location: ${response.data.latitude}, ${response.data.longitude}`;
        countryDisplay.textContent = `Country: ${response.data.country_name}`;


    });


});

